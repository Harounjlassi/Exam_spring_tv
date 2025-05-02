package tn.esprit.exam_spring_tv.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;

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
    private HashSet<Utilisateur> utilisateurs = new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private Chaine chaine;
}
