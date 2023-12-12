package dev.emjey.workbookeightpointthree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.emjey.workbookeightpointthree.exception.ContactNotFoundException;
import dev.emjey.workbookeightpointthree.exception.ErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


// This file is made by EmJey
// Project: Workbook 8.2
// FileName: ApplicationExceptionHandler.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
// Email: emjeydev@gmail.com
// Github: emjeydev

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ContactNotFoundException.class)
    public ResponseEntity<Object> handleContactNotFoundException(ContactNotFoundException ex) {
        ErrorResponse error = new ErrorResponse(Arrays.asList(ex.getLocalizedMessage()));
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<String> errorList = new ArrayList<>();
        for (ObjectError error : ex.getAllErrors()) {
            errorList.add(error.getDefaultMessage());
        }
        ErrorResponse errors = new ErrorResponse(errorList);
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
