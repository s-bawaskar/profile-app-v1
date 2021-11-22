package com.example.profile.repository;

import com.example.profile.entity.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {
}
