package com.example.drfennich.controller;

import com.example.drfennich.model.RendezVous;
import com.example.drfennich.service.RendezVousService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rendezVous")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RenndezVousController {

    private RendezVousService rendezVousService;

    public RenndezVousController(RendezVousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }

    @PostMapping("/addRendezVous")
    public void addRendezVous(@RequestBody RendezVous rendezVous) {
        rendezVousService.addRendezVous(rendezVous);
    }

    @GetMapping("/allRendezVous")
    public List<RendezVous> getAllRendezVous() {
        return rendezVousService.getALlRendezVous();
    }
}
