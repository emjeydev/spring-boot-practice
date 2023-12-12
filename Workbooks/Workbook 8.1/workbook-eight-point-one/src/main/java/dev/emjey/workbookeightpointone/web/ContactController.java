package dev.emjey.workbookeightpointone.web;

import java.util.List;

import dev.emjey.workbookeightpointone.exception.NoContactException;
import dev.emjey.workbookeightpointone.pojo.Contact;
import dev.emjey.workbookeightpointone.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


// This file is made by EmJey
// Project: Workbook 8.1
// FileName: ContactController.java
// Date: 2023/12/12
// Modified Date: 2023/12/12
// Email: emjeydev@gmail.com
// Github: emjeydev


@RestController
public class ContactController {
    
    @Autowired
    private ContactService contactService;

    @GetMapping("/contact/all")
    public ResponseEntity<List<Contact>> getContacts() {
        List<Contact> contacts = contactService.getContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/contact/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable String id) {
        try {
            Contact contact = contactService.getContactById(id);
            return new ResponseEntity<>(contact, HttpStatus.OK);
        } catch (NoContactException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/contact")
    public ResponseEntity<HttpStatus> createContact(@RequestBody Contact contact) {
        contactService.saveContact(contact);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/contact/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable String id, @RequestBody Contact contact) {
        try {
            contactService.updateContact(id, contact);
            return new ResponseEntity<Contact>(contactService.getContactById(id), HttpStatus.OK);
        } catch (NoContactException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/contact/{id}")
    public ResponseEntity<HttpStatus> deleteContact(@PathVariable String id) {
        try {
            contactService.deleteContact(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (NoContactException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}