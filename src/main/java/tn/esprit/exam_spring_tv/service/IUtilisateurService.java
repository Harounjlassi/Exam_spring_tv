package tn.esprit.exam_spring_tv.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.exam_spring_tv.entity.Profession;
import tn.esprit.exam_spring_tv.entity.Thematique;
import tn.esprit.exam_spring_tv.entity.Utilisateur;
import tn.esprit.exam_spring_tv.repository.IUtilisateurRepository;

import java.util.Date;
import java.util.List;

public interface IUtilisateurService {


     Utilisateur ajouterUtilisateur (Utilisateur u);
      List<Utilisateur> recupererUtilisateurs(Profession p, Date d, Thematique t);

}
