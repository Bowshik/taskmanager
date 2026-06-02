package com.bowshik.taskmanager;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
}