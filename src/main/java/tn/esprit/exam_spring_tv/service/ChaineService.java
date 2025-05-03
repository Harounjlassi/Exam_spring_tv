package tn.esprit.exam_spring_tv.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.exam_spring_tv.entity.Chaine;
import tn.esprit.exam_spring_tv.repository.IChaineRepository;

import java.util.List;

@Slf4j

@Service
public class ChaineService implements IChaineService {
    @Autowired
    IChaineRepository chaineRepository;

    @Override
    @Scheduled(cron = "*/20 * * * * *")
    public void ordonnerChaines() {

        List<Object[]> l = chaineRepository.listerchaines();

        for (Object[] obj : l) {
            Chaine chaine = (Chaine) obj[0];
            Long nbre = (Long) obj[1];
            log.info("Chaine : " + chaine.getChNom() + ".  Nombre de fois où les programmes de cette Chaine sont marqués comme favoris  : " + nbre);
        }
    }
}
