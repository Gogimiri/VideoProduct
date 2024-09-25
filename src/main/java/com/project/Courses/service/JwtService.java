package com.project.Courses.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {

    String extractUserName(String token);


    String generateToken(UserDetails userDetails);


}
