package com.duc.oauth2.service;

import com.duc.oauth2.entity.User;

public interface JwtService {
    String generateToken(User user);
    String extractUsername(String token);
}
