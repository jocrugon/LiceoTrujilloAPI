package com.liceotrujillo.apiclt.common.security.jwt;

import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;
}
