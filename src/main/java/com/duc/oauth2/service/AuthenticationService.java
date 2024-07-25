package com.duc.oauth2.service;

import com.duc.oauth2.model.AuthenticationRequest;
import com.duc.oauth2.model.AuthenticationResponse;
import com.duc.oauth2.model.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse login(AuthenticationRequest request);
}
