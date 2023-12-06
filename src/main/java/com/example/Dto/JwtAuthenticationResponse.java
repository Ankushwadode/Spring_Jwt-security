package com.example.Dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class JwtAuthenticationResponse {

    private String token;

    private String refreshToken;

}
