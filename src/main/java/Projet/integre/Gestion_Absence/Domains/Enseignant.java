package Projet.integre.Gestion_Absence.Domains;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Enseignant extends Utilisateur {
    @OneToMany(mappedBy = "seanceEnseignant")
    private Set<Seance> seances = new HashSet<>();
}
