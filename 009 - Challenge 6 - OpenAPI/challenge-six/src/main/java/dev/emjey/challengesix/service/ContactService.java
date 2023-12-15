package dev.emjey.challengesix.service;

import dev.emjey.challengesix.pojo.Contact;

import java.util.List;


// This file is made by EmJey
// Project: contacts
// FileName: ContactService.java
// Date: 2023/12/15
// Modified Date: 2023/12/15
// Email: emjeydev@gmail.com
// Github: emjeydev


public interface ContactService {
    Contact getContactById(String id);
    void saveContact(Contact contact);
    List<Contact> getContacts();
}
