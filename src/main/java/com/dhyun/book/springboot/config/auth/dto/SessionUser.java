package com.dhyun.book.springboot.config.auth.dto;

import com.dhyun.book.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name=user.getName();
        this.email=user.getEmail();
        this.picture=user.getPicture();
    }
}
