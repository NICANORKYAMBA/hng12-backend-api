package com.hng12.backend.service;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.hng12.backend.model.Response;

@Service
public class ApiService {

    public Response getResponse() {
        String email = "nicanorkyamba98@gmail.com";
        String current_datetime = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
        String github_url = "https://github.com/NICANORKYAMBA/hng12-backend-api";

        return new Response(email, current_datetime, github_url);
    }
}