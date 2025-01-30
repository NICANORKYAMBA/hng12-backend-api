package com.hng12.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hng12.backend.model.DefaultResponse;

@RestController
public class HomeController {

    @GetMapping("/")
    public DefaultResponse welcome() {
        return new DefaultResponse("Welcome to the HNG12 Backend API!");
    }
}