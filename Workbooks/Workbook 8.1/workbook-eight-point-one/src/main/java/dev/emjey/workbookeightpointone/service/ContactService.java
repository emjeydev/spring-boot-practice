package dev.emjey.workbookeightpointone.service;

import dev.emjey.workbookeightpointone.exception.NoContactException;
import dev.emjey.workbookeightpointone.pojo.Contact;

import java.util.List;


// This file is made by EmJey
// Project: Workbook 8.1
// FileName: ContactService.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
// Email: emjeydev@gmail.com
// Github: emjeydev

public interface ContactService {
    Contact getContactById(String id) throws NoContactException;
    void saveContact(Contact contact);
    void updateContact(String id, Contact contact) throws NoContactException;
    void deleteContact(String id) throws NoContactException;
    List<Contact> getContacts();
}
