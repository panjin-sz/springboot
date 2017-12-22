package com.panjin.service;

import com.panjin.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author panjin.
 * @date 2017/12/21.
 */
@Service
public class UserService {

    @Value("${user.myname}")
    private String name;

    public User getUser() {
        User user = new User();
        user.setUserName(name);
        return user;
    }
}
