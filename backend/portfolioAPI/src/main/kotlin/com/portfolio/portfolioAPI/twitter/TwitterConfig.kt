package com.portfolio.portfolioAPI.twitter

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.*
import org.springframework.social.twitter.api.impl.TwitterTemplate

@Configuration
class TwitterConfig {
    @Value("\${spring.social.twitter.appId}")
    private val consumerKey: String? = null

    @Value("\${spring.social.twitter.appSecret}")
    private val consumerSecret: String? = null

    @Value("\${twitter.access.token}")
    private val accessToken: String? = null

    @Value("\${twitter.access.token.secret}")
    private val accessTokenSecret: String? = null

    @get:Bean
    val twtTemplate: TwitterTemplate
        get() = TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret)
}