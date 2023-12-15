package dev.emjey.challengesix.exception;


// This file is made by EmJey
// Project: contacts
// FileName: ContactNotFoundException.java
// Date: 2023/12/15
// Modified Date: 2023/12/15
// Email: emjeydev@gmail.com
// Github: emjeydev

public class ContactNotFoundException extends RuntimeException {

    public ContactNotFoundException(String id) {
        super("The id '" + id + "' does not exist in our records");
    }

}
