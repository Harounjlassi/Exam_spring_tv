package tn.esprit.exam_spring_tv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exam_spring_tv.repository.IChineRepository;

@Service
public class ChaineService implements IChaineService {
    @Autowired
    IChineRepository chineRepository;

}
