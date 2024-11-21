package dev.emjey.contacts.pojo;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

/**
 * This file is made by EmJey
 * Project: Contacts - Spring Security
 * FileName: Contact.java
 * Date: 2024/11/21
 * Modified Date: 2024/11/21
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */

public class Contact {

    private String id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Phone number cannot be blank")
    private String phoneNumber;

    public Contact(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(){
        this.id = UUID.randomUUID().toString();
    } 

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
