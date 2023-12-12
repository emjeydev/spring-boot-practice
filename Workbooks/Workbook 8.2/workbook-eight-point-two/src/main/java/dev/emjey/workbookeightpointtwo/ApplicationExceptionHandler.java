package dev.emjey.workbookeightpointtwo;

import dev.emjey.workbookeightpointtwo.exception.ContactNotFoundException;
import dev.emjey.workbookeightpointtwo.exception.ErrorResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


// This file is made by EmJey
// Project: Workbook 8.2
// FileName: ApplicationExceptionHandler.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
// Email: emjeydev@gmail.com
// Github: emjeydev

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(ContactNotFoundException.class)
    public ResponseEntity<Object> handleContactNotFoundException(ContactNotFoundException e) {
        ErrorResponse errorResponse = new ErrorResponse(e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
