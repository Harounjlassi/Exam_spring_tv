package tn.esprit.exam_spring_tv.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.exam_spring_tv.entity.Profession;
import tn.esprit.exam_spring_tv.entity.Programme;
import tn.esprit.exam_spring_tv.entity.Thematique;
import tn.esprit.exam_spring_tv.entity.Utilisateur;

import java.util.Date;
import java.util.List;

public interface IUtilisateurRepository extends CrudRepository<Utilisateur, Long> {

    List<Utilisateur> findUtilisateurByUsrNom(String usrNom);

    @Query("SELECT DISTINCT u FROM Utilisateur u " +
            "inner JOIN u.programmes p " +
            "WHERE u.profession = :p " +
            "AND u.usrDateInscription >= :d " +
            "AND p.chaine.chTheme = :t")
    List<Utilisateur> recupererUtilisateurs(@Param("p") Profession p,
                                            @Param("d") Date d,
                                            @Param("t") Thematique t);

    }
