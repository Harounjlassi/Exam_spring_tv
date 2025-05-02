package tn.esprit.exam_spring_tv.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.exam_spring_tv.entity.Programme;
import tn.esprit.exam_spring_tv.entity.Utilisateur;

public interface IUtilisateurRepository extends CrudRepository<Utilisateur, Long> {
}
