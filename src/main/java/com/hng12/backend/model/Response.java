package com.hng12.backend.model;

public class Response {
    private String email;
    private String currentDatetime;
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