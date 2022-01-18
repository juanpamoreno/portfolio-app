package com.portfolio.portfolioAPI.twitter

import org.springframework.social.twitter.api.Tweet
import org.springframework.web.bind.annotation.*

@RestController
class TwitterController(val twitterService: TwitterService) {

    @CrossOrigin(origins = ["http://localhost:4200"])
    @GetMapping("/tweets")
    fun getLastTweets(@RequestParam username: String?): List<Tweet?> {
        println(username)
        if(username == null) return emptyList()
        return twitterService.getLastTweets(username)
    }
}