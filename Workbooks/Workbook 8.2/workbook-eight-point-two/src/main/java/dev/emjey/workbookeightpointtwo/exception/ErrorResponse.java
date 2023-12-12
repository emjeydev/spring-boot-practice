package dev.emjey.workbookeightpointtwo.exception;

// This file is made by EmJey
// Project: Workbook 8.2
// FileName: ErrorResponse.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
// Email: emjeydev@gmail.com
// Github: emjeydev

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class ErrorResponse {
    private String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime dateTime;

    public ErrorResponse(String message) {
        this.dateTime = LocalDateTime.now();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
