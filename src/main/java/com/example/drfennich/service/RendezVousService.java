package com.example.drfennich.service;

import com.example.drfennich.model.RendezVous;
import com.example.drfennich.repositoy.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendezVousService {

    private RendezVousRepository rendezVousRepository;

    public RendezVousService(RendezVousRepository rendezVousRepository) {
        this.rendezVousRepository = rendezVousRepository;
    }

    public void addRendezVous(RendezVous rendezVous) {
        rendezVousRepository.save(rendezVous);
    }

    public List<RendezVous> getALlRendezVous() {
        return rendezVousRepository.findAll();
    }
}
