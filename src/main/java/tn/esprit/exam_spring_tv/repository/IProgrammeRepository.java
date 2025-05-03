package tn.esprit.exam_spring_tv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.exam_spring_tv.entity.Programme;

import java.util.List;

public interface IProgrammeRepository extends JpaRepository<Programme, Long> {
    List<Programme> findProgrammeByPrdNom(String prdNom);
}
