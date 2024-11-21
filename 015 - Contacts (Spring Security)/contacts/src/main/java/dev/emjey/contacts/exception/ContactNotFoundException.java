package dev.emjey.contacts.exception;

/**
 * This file is made by EmJey
 * Project: Contacts - Spring Security
 * FileName: ContactNotFoundException.java
 * Date: 2024/11/21
 * Modified Date: 2024/11/21
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public class ContactNotFoundException extends RuntimeException { 

    public ContactNotFoundException(String id) {
        super("The id '" + id + "' does not exist in our records");
    }
    
}
