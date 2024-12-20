package dev.emjey.contacts.service;

import java.util.List;
import java.util.stream.IntStream;

import dev.emjey.contacts.exception.ContactNotFoundException;
import dev.emjey.contacts.pojo.Contact;
import dev.emjey.contacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This file is made by EmJey
 * Project: Contacts - Spring Security
 * FileName: ContactServiceImpl.java
 * Date: 2024/11/21
 * Modified Date: 2024/11/21
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact getContactById(String id) {
        return contactRepository.getContact(findIndexById(id));
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.saveContact(contact);
    }

    @Override
    public List<Contact> getContacts() {
        return contactRepository.getContacts();
    }

    @Override
    public void deleteContact(String id) {
        contactRepository.deleteContact(findIndexById(id)); 
    }


    private int findIndexById(String id) {
        return IntStream.range(0, contactRepository.getContacts().size())
            .filter(index -> contactRepository.getContacts().get(index).getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new ContactNotFoundException(id));
    }

}
