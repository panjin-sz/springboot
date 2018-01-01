package com.panjin.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class InvokeController {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping(value = "/getMsg")
    public String getMsg(@RequestParam Long id) {
        RestTemplate restTemplate = getRestTemplate();
        String jsonStr = restTemplate.getForObject("http://localhost:18765/getPerson?id="+id, String.class);
        return jsonStr;
    }
}
