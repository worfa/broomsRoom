package org.electricBrooms.user;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AutrhenticationUser {

    public String getLogin(){
        Authentication authentication = getAuthentication();
        return authentication.getName();
    }

    public Authentication getAuthentication(){
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
