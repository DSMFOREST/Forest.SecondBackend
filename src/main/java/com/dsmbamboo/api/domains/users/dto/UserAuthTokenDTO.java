package com.dsmbamboo.api.domains.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthTokenDTO {

    private String accessToken;
    private String refreshToken;

}
