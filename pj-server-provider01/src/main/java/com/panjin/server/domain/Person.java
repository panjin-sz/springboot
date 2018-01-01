package com.panjin.server.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    private long id;
    private String name;
    private int age;
}
