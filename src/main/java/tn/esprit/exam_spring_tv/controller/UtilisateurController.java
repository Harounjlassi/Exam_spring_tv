package tn.esprit.exam_spring_tv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.exam_spring_tv.entity.Profession;
import tn.esprit.exam_spring_tv.entity.Thematique;
import tn.esprit.exam_spring_tv.entity.Utilisateur;
import tn.esprit.exam_spring_tv.service.UtilisateurService;

import java.util.Date;
import java.util.List;

@RestController

public class UtilisateurController {

    @Autowired
     UtilisateurService utilisateurService;

    @PostMapping("/utilisateur/add")
    public Utilisateur ajouterUtilisateur (@RequestBody Utilisateur u){
        return utilisateurService.ajouterUtilisateur(u);
    }

    @PostMapping("/utilisateur/{p}/{d}/{t}")
    public List<Utilisateur> recupererUtilisateurs (@PathVariable Profession p, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date d ,@PathVariable Thematique t){

        return utilisateurService.recupererUtilisateurs(   p,  d,  t);
    }
}
