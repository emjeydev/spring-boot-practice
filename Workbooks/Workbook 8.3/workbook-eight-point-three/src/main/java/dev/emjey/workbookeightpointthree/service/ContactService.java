package dev.emjey.workbookeightpointthree.service;

import dev.emjey.workbookeightpointthree.pojo.Contact;

import java.util.List;

// This file is made by EmJey
// Project: Workbook 8.2
// FileName: ContactService.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
// Email: emjeydev@gmail.com
// Github: emjeydev

public interface ContactService {
    Contact getContactById(String id);
    void saveContact(Contact contact);
    void updateContact(String id, Contact contact);
    void deleteContact(String id);
    List<Contact> getContacts();
}
