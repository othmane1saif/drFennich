package com.example.drfennich.repositoy;

import com.example.drfennich.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
