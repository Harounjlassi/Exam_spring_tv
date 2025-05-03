package tn.esprit.exam_spring_tv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exam_spring_tv.entity.Chaine;
import tn.esprit.exam_spring_tv.entity.Programme;
import tn.esprit.exam_spring_tv.entity.Utilisateur;
import tn.esprit.exam_spring_tv.repository.IChaineRepository;
import tn.esprit.exam_spring_tv.repository.IProgrammeRepository;
import tn.esprit.exam_spring_tv.repository.IUtilisateurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProgrammeService implements IProgrammeService {
    @Autowired
    IProgrammeRepository programmeRepository;
    @Autowired
    IChaineRepository chineRepository;
    @Autowired
    IUtilisateurRepository utilisateurRepository;

    @Override
    public Programme ajouterProgrammeEtChaine(Programme p) {
        return programmeRepository.save(p);
    }

    @Override
    public Programme ajouterProgrammeEtAffecterChaine(Programme p, Long chId) {
        Chaine ch = chineRepository.findById(chId).get();
        p.setChaine(ch);
        return programmeRepository.save(p);


    }

    @Override
    public void affecterProgrammeAUtilisateur(String prNom, String usrNom) {
        Programme programme=programmeRepository.findProgrammeByPrdNom(prNom).get(0);

   List<Utilisateur> us = utilisateurRepository.findUtilisateurByUsrNom(usrNom);
           //.get();
        //us.getProgrammes().add(programme);
        programme.setUtilisateurs((Set<Utilisateur>) us);
        programmeRepository.save(programme);


    }
}
