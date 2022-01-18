import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TweetV2 } from 'twitter-api-v2';
import { ProfileInfo } from 'src/models/profile-info-model';
import { last, Observable } from 'rxjs';

const BACKEND_API_URL = 'http://localhost:8080';
const PROFILE_ENDPOINT = '/profile';
const TWITTER_ENDPOINT = '/tweets';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private http: HttpClient) {}

  getProfileInfo(name: string): Observable<ProfileInfo> {
    return this.http.get<ProfileInfo>(BACKEND_API_URL + PROFILE_ENDPOINT, {
      params: {
        name
      }
    });
  }

  // updateProfileInfo(profileInfo: ProfileInfo) {

  // }

  getLastTweets(username?: string): Observable<TweetV2[]> {
    return this.http.get<TweetV2[]>(BACKEND_API_URL + TWITTER_ENDPOINT, {
      params: {
        username: username || ''
      }
    })
  }

}
