package com.dbsl.springsecurity6jwt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationRequest {
    private String username;
    private String password;
}
