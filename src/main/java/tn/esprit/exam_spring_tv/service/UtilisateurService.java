package tn.esprit.exam_spring_tv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exam_spring_tv.entity.Profession;
import tn.esprit.exam_spring_tv.entity.Thematique;
import tn.esprit.exam_spring_tv.entity.Utilisateur;
import tn.esprit.exam_spring_tv.repository.IUtilisateurRepository;

import java.util.Date;
import java.util.List;

@Service
public class UtilisateurService implements IUtilisateurService {

    @Autowired
    IUtilisateurRepository utilisateurRepository;


    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @Override
    public List<Utilisateur> recupererUtilisateurs(Profession p, Date d, Thematique t) {
        return utilisateurRepository.recupererUtilisateurs(p, d, t);
    }
}
