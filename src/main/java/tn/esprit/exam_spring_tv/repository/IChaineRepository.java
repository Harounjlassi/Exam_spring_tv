package tn.esprit.exam_spring_tv.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.exam_spring_tv.entity.Chaine;

import java.util.List;

public interface IChaineRepository extends CrudRepository<Chaine, Long> {
    @Query("SELECT p.chaine, count(p) AS cp FROM Programme p " +
            "INNER JOIN p.utilisateurs u " +
            "WHERE u.usrId IS NOT NULL " +
            "GROUP BY p.chaine ORDER BY cp DESC")
    List<Object[]> listerchaines();
}
