package com.portfolio.portfolioAPI.twitter

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.social.twitter.api.Tweet
import org.springframework.social.twitter.api.Twitter
import org.springframework.stereotype.Service

@Service
class TwitterService {

    @Autowired
    private val twitter: Twitter? = null

    fun getLastTweets(username: String?): List<Tweet> {
        try {
            return twitter?.timelineOperations()?.getUserTimeline(username, 5) as List<Tweet>
        } catch (error: Exception) {
            return emptyList()
        }
    }
}