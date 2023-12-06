package com.example.Services;

import com.example.Dto.JwtAuthenticationResponse;
import com.example.Dto.RefreshTokenRequest;
import com.example.Dto.SignInRequest;
import com.example.Dto.SignUpRequest;
import com.example.Entities.User;
import org.springframework.stereotype.Component;


public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
