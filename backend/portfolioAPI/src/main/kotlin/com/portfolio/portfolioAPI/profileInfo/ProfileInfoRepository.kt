package com.portfolio.portfolioAPI.profileInfo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ProfileInfoRepository: JpaRepository<ProfileInfoModel, Long> {
    @Query("SELECT id, experience, imagePath, name, twitterUser FROM portfolio p WHERE p.name=:name LIMIT 1", nativeQuery = true)
    fun findProfileInfo(@Param("name") name: String): ProfileInfoModel?
}