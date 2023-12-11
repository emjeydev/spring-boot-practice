package dev.emjey.contacts.service;

// This file is made by EmJey
// Project: contacts
// FileName: ContactService.java
// Date: 2023/12/11
// Modified Date: 2023/12/11
// Email: emjeydev@gmail.com
// Github: emjeydev

import dev.emjey.contacts.pojo.Contact;

import java.util.List;

public interface ContactService {

    Contact getContactById(String id);
    void saveContact(Contact contact);
    void updateContact(String id, Contact contact);
    void deleteContact(String id);
    List<Contact> getAllContacts();
    
}
