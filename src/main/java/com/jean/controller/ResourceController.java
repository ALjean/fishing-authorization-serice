/*
package com.jean.controller;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//http://localhost:9090/auth/user
@RestController
public class ResourceController {


    @RequestMapping(value = { "/user" }, produces = "application/json")
    public Map<String, Object> user(OAuth2Authentication user) {
        Map<String, Object> userDetails = new HashMap<>();
        userDetails.put("user", user.getUserAuthentication().getPrincipal());
        userDetails.put("authorities",
                AuthorityUtils.authorityListToSet(user.getUserAuthentication().getAuthorities()));
        return userDetails;
    }

}
*/
