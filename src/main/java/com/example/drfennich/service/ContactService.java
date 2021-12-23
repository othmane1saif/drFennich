package com.example.drfennich.service;


import com.example.drfennich.model.Contact;
import com.example.drfennich.repositoy.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void addContact(Contact contact) {
        contactRepository.save(contact);
    }

    public List<Contact> getAllcontacts() {
        return contactRepository.findAll();
    }
}
