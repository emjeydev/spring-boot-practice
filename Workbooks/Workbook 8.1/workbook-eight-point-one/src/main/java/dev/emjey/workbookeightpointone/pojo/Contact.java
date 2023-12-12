package dev.emjey.workbookeightpointone.pojo;

import java.util.UUID;

// This file is made by EmJey
// Project: Workbook 8.1
// FileName: Contact.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Contact {

    private String id;
    private String name;
    private String phoneNumber;


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
