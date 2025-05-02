package tn.esprit.exam_spring_tv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.exam_spring_tv.entity.Utilisateur;
import tn.esprit.exam_spring_tv.service.UtilisateurService;

@RestController

public class UtilisateurController {

    @Autowired
     UtilisateurService utilisateurService;

    @PostMapping("/utilisateur/add")
    public Utilisateur ajouterUtilisateur (@RequestBody Utilisateur u){
        return utilisateurService.ajouterUtilisateur(u);
    }
}
