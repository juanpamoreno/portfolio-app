package com.portfolio.portfolioAPI.profileInfo

import javax.persistence.*

@Entity
@Table(name="portfolio")
data class ProfileInfoModel(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    val experience: String = "",
    @Column(name = "imagePath")
    val imagePath: String = "",
    val name: String = "",
    @Column(name = "twitterUser")
    val twitterUser: String = "",
)