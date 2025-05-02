package tn.esprit.exam_spring_tv.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.exam_spring_tv.entity.Programme;

public interface IProgrammeRepository extends CrudRepository<Programme, Long> {
}
