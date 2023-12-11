package dev.emjey.contacts.web;

import dev.emjey.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


// This file is made by EmJey
// Project: contacts
// FileName: ContactController.java
// Date: 2023/12/11
// Modified Date: 2023/12/11
// Email: emjeydev@gmail.com
// Github: emjeydev



@Controller
public class ContactController {
    
    @Autowired
    private ContactService contactService;

}
