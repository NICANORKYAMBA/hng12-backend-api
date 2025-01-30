package com.hng12.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    private String email;

    @JsonProperty("current_datetime")
    private String currentDatetime;

    @JsonProperty("github_url")
    private String githubUrl;

    public Response(String email, String currentDatetime, String githubUrl) {
        this.email = email;
        this.currentDatetime = currentDatetime;
        this.githubUrl = githubUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentDatetime() {
        return currentDatetime;
    }

    public String getGithubUrl() {
        return githubUrl;
    }
}