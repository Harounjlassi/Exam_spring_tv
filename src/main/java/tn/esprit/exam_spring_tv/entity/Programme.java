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
public class Programme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prdId;
    private String prdNom;

    @ManyToMany(mappedBy = "programmes", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ToString.Exclude
    @JsonIgnore
    private Set<Utilisateur> utilisateurs = new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    @JsonIgnore
    private Chaine chaine;
}
