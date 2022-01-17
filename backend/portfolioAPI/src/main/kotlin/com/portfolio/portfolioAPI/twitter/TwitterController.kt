package com.portfolio.portfolioAPI.twitter

import org.springframework.social.twitter.api.Tweet
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TwitterController(val twitterService: TwitterService) {

    @GetMapping("/tweets")
    fun getLastTweets(@RequestParam username: String?): List<Tweet?> {
        if(username == null) return emptyList()
        return twitterService.getLastTweets(username)
    }
}