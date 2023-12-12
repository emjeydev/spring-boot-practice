package dev.emjey.workbookeightpointtwo.exception;

// This file is made by EmJey
// Project: Workbook 8.2
// FileName: ContactNotFoundException.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
// Email: emjeydev@gmail.com
// Github: emjeydev
public class ContactNotFoundException extends RuntimeException {

    public ContactNotFoundException(String id) {
        super("The Id'" + id + "' does not exist in our database");
    }
}
