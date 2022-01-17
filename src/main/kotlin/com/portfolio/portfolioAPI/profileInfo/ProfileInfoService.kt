package com.portfolio.portfolioAPI.profileInfo

import org.springframework.stereotype.Service

@Service
class ProfileInfoService(val profileInfoRepository: ProfileInfoRepository) {

    fun getProfileInfo(name: String): ProfileInfoModel? = profileInfoRepository.findProfileInfo(name)

    fun setProfileInfo(profileInfo: ProfileInfoModel) {
        val currentProfileInfo = profileInfoRepository.findProfileInfo(profileInfo.name)
        if(currentProfileInfo?.id != null) profileInfo.id = currentProfileInfo.id
        profileInfoRepository.save(profileInfo)
    }

}