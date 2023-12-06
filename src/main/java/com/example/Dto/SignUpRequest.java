package com.example.Dto;

import com.example.Entities.Role;
import lombok.Data;

@Data
public class SignUpRequest {

    private String firstName;

    private String secondName;

    private String email;

    private String password;

}
