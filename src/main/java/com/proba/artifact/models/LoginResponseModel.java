package com.proba.artifact.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponseModel {
    private String token;
    private String refreshToken;
}
