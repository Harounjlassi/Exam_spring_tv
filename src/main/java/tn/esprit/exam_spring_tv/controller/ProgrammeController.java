package tn.esprit.exam_spring_tv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.exam_spring_tv.entity.Programme;
import tn.esprit.exam_spring_tv.service.ProgrammeService;

@RestController
public class ProgrammeController {
    @Autowired
     ProgrammeService programmeService;
    @PostMapping("/Programme/add")
    public Programme ajouterProgrammeEtChaine (@RequestBody  Programme p){
        return programmeService.ajouterProgrammeEtChaine(p);
    }

    @PostMapping("/ProgrammeAffect/add/{chId}")

    public Programme ajouterProgrammeEtAffecterChaine (@RequestBody  Programme p, @PathVariable  Long chId){
        return programmeService.ajouterProgrammeEtAffecterChaine(p,chId);

    }
    @PostMapping("/ProgrammeAffectUtili/add/{prNom}/{usrNom}")

    public void affecterProgrammeAUtilisateur (@PathVariable String prNom, @PathVariable  String usrNom){
        programmeService.affecterProgrammeAUtilisateur(prNom,usrNom);

    }

}
