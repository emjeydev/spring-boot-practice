package dev.emjey.workbookeightpointthree.repository;

import java.util.ArrayList;
import java.util.List;

import dev.emjey.workbookeightpointthree.pojo.Contact;
import org.springframework.stereotype.Repository;


// This file is made by EmJey
// Project: Workbook 8.2
// FileName: ContactRepository.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
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

    public void updateContact(int index, Contact contact) { 
        contacts.set(index, contact); 
    }
    
    public void deleteContact(int index) {
        contacts.remove(index);
    }

}
