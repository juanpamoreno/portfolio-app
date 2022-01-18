import { Component, OnInit } from '@angular/core';
import { map, Observable, switchMap } from 'rxjs';
import { ProfileInfo } from 'src/models/profile-info-model';
import { AppService } from './app.service';
import { ActivatedRoute } from '@angular/router';
import { TweetV2 } from 'twitter-api-v2';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';
  $profileInfo: Observable<ProfileInfo>;
  $tweets: Observable<TweetV2[]>;
  name: string = '';
  constructor(
    private appService: AppService,
    private activatedRoute: ActivatedRoute,
  ) {
    this.$profileInfo = this.activatedRoute.queryParams.pipe(
      switchMap(params => this.appService.getProfileInfo(params['name']))
    );
    // this.activatedRoute.queryParams.subscribe(params => this.name = params['name']);
    // this.$profileInfo = this.appService.getProfileInfo(this.name);
    this.$tweets = this.$profileInfo.pipe(
      switchMap(profileInfo => this.appService.getLastTweets(profileInfo.twitterUser))
    );
  }

}
