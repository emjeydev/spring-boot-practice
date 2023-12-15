package dev.emjey.challengesix.repository;

import java.util.ArrayList;
import java.util.List;

import dev.emjey.challengesix.pojo.Contact;
import org.springframework.stereotype.Repository;


// This file is made by EmJey
// Project: contacts
// FileName: ContactRepository.java
// Date: 2023/12/15
// Modified Date: 2023/12/15
// Email: emjeydev@gmail.com
// Github: emjeydev


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

}
