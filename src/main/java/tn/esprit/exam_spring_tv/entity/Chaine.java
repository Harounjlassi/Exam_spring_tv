package tn.esprit.exam_spring_tv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chaine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chId;
    private String chNom;
    @Enumerated(EnumType.STRING)

    private Thematique chTheme;
    @ManyToMany
    @JsonIgnore
    private Set<Programme> chProgrammes;

}
