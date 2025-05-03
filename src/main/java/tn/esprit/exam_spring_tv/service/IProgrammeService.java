package tn.esprit.exam_spring_tv.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.exam_spring_tv.entity.Profession;
import tn.esprit.exam_spring_tv.entity.Programme;
import tn.esprit.exam_spring_tv.entity.Thematique;
import tn.esprit.exam_spring_tv.entity.Utilisateur;
import tn.esprit.exam_spring_tv.repository.IProgrammeRepository;

public interface IProgrammeService {
     Programme ajouterProgrammeEtChaine (Programme p);

      Programme ajouterProgrammeEtAffecterChaine (Programme p, Long chId);
     void affecterProgrammeAUtilisateur (String prNom, String usrNom);
    }
