package dev.emjey.challengeseven.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

// This file is made by EmJey
// Project: contacts
// FileName: ErrorResponse.java
// Date: 2023/12/15
// Modified Date: 2023/12/15
// Email: emjeydev@gmail.com
// Github: emjeydev

public class ErrorResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private List<String> message;
    

    public ErrorResponse(List<String> message) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }


    public List<String> getMessage() {
        return this.message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }



}
