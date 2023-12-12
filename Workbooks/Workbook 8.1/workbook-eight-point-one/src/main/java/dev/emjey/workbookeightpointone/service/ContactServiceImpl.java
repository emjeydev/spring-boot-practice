package dev.emjey.workbookeightpointone.service;

import java.util.List;
import java.util.stream.IntStream;

import dev.emjey.workbookeightpointone.exception.NoContactException;
import dev.emjey.workbookeightpointone.pojo.Contact;
import dev.emjey.workbookeightpointone.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// This file is made by EmJey
// Project: Workbook 8.1
// FileName: ContactServiceImpl.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
// Email: emjeydev@gmail.com
// Github: emjeydev


@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact getContactById(String id) throws NoContactException{
        return contactRepository.getContact(findIndexById(id));
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.saveContact(contact);
    }

    @Override
    public void updateContact(String id, Contact contact) throws NoContactException{
        contactRepository.updateContact(findIndexById(id), contact);
    }

    @Override
    public void deleteContact(String id) throws NoContactException{
        contactRepository.deleteContact(findIndexById(id)); 
    }

    @Override
    public List<Contact> getContacts() {
        return contactRepository.getContacts();
    }


    private int findIndexById(String id) throws NoContactException {
        return IntStream.range(0, contactRepository.getContacts().size())
            .filter(index -> contactRepository.getContacts().get(index).getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new NoContactException());
    }

}
