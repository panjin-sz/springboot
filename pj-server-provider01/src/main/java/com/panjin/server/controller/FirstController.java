package com.panjin.server.controller;

import com.panjin.server.domain.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @RequestMapping(value = "/getPerson", method = RequestMethod.GET)
    public Person getPerson(@RequestParam Long id) {
        Person p = new Person();
        p.setAge(32);
        p.setId(id);
        p.setName("jack");
        return p;
    }
}