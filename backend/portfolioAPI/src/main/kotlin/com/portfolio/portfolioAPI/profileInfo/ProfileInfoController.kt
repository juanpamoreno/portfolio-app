package com.portfolio.portfolioAPI.profileInfo

import org.springframework.web.bind.annotation.*

@RestController
class ProfileInfoController(val profileInfoService: ProfileInfoService) {
    @CrossOrigin(origins = ["http://localhost:4200"])
    @GetMapping("/profile")
    fun getProfileInfo(@RequestParam name: String?): ProfileInfoModel? {
        if(name == null) return ProfileInfoModel()
        return profileInfoService.getProfileInfo(name)
    }

    @CrossOrigin(origins = ["http://localhost:4200"])
    @PostMapping("/profile")
    fun setProfileInfo(@RequestBody profileInfo: ProfileInfoModel) {
        profileInfoService.setProfileInfo(profileInfo)
    }
}