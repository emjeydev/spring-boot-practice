package dev.emjey.contacts.repository;

import java.util.ArrayList;
import java.util.List;

import dev.emjey.contacts.pojo.Contact;
import org.springframework.stereotype.Repository;

/**
 * This file is made by EmJey
 * Project: Contacts - Spring Security
 * FileName: ContactRepository.java
 * Date: 2024/11/21
 * Modified Date: 2024/11/21
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */

@Repository
public class ContactRepository {
    
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(int index) {
        contacts.remove(index);
    }


}
