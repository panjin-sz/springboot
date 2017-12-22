package com.panjin.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author panjin.
 * @date 2017/12/21.
 */
@Getter
@Setter
@ToString
public class User {

    private long userId;
    private String userName;
    private int age;
}
