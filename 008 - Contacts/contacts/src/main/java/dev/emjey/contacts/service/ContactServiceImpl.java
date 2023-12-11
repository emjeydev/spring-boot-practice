package dev.emjey.contacts.service;

import java.util.List;
import java.util.stream.IntStream;

import dev.emjey.contacts.pojo.Contact;
import dev.emjey.contacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// This file is made by EmJey
// Project: contacts
// FileName: ContactServiceImpl.java
// Date: 2023/12/11
// Modified Date: 2023/12/11
// Email: emjeydev@gmail.com
// Github: emjeydev


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
    public void updateContact(String id, Contact contact) {
        contactRepository.updateContact(findIndexById(id), contact);
    }

    @Override
    public void deleteContact(String id) {
        contactRepository.deleteContact(findIndexById(id));
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.getContacts();
    }


    private int findIndexById(String id) {
        return IntStream.range(0, contactRepository.getContacts().size()).filter(index -> contactRepository.getContacts().get(index).getId().equals(id)).findFirst().orElseThrow();
    }
}
