package com.example.drfennich.controller;


import com.example.drfennich.model.Contact;
import com.example.drfennich.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContactController {

    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/addMessage")
    public void addMessage(@RequestBody Contact contact) {
        contactService.addContact(contact);
    }

    @GetMapping("/messages")
    public List<Contact> getAllMessages() {
         return contactService.getAllcontacts();
    }
}
