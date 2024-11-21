package dev.emjey.contacts.service;

import dev.emjey.contacts.pojo.Contact;

import java.util.List;

/**
 * This file is made by EmJey
 * Project: Contacts - Spring Security
 * FileName: ContactService.java
 * Date: 2024/11/21
 * Modified Date: 2024/11/21
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public interface ContactService {
    Contact getContactById(String id);

    void saveContact(Contact contact);

    List<Contact> getContacts();

    void deleteContact(String id);

}
