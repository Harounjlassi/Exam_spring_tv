package tn.esprit.exam_spring_tv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exam_spring_tv.repository.IProgrammeRepository;

@Service
public class ProgrammeService implements IProgrammeService {
    @Autowired
    IProgrammeRepository programmeRepository;

}
