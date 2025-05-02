package tn.esprit.exam_spring_tv.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.exam_spring_tv.entity.Utilisateur;
import tn.esprit.exam_spring_tv.repository.IUtilisateurRepository;

public interface IUtilisateurService {


     Utilisateur ajouterUtilisateur (Utilisateur u);

}
