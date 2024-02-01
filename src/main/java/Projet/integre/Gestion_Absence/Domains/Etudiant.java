package Projet.integre.Gestion_Absence.Domains;

import Projet.integre.Gestion_Absence.Enumerations.Genre;
import Projet.integre.Gestion_Absence.Enumerations.Niveau;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Entity;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Etudiant extends Utilisateur {


    @Enumerated(EnumType.STRING)
    private Genre genre;
    @NotNull
    private String Formation;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToMany(mappedBy = "absenceEtudiant")
    private Set<Absence> absences = new HashSet<>();
}
