package com.example.profile.controller;

import com.example.profile.entity.Profile;
import com.example.profile.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProfileController {
    @Autowired
    ProfileRepository profileRepository;
    @GetMapping(path = "/")
    public  @ResponseBody List<Profile> getProfiles(){
        return profileRepository.findAll();
    }
    @PostMapping("/")
    public @ResponseBody Profile createProfile(@RequestBody Profile profile){
        Profile result=profileRepository.save(profile);
        return result;
    }
}
