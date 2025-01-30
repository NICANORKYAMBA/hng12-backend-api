package com.hng12.backend.service;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.hng12.backend.model.Response;

@Service
public class ApiService {

    public Response getResponse() {
        String email = "nicanorkyamba98@gmail.com";
        String currentDatetime = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
        String githubUrl = "https://github.com/NICANORKYAMBA/hng12-backend-api";

        return new Response(email, currentDatetime, githubUrl);
    }
}