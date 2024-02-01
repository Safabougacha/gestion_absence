package Projet.integre.Gestion_Absence.Domains;

import Projet.integre.Gestion_Absence.Enumerations.Nom_Module;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Module {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_module;
    @Enumerated(EnumType.STRING)
    private Nom_Module nom;
    @NotNull
    private int nombre_heures;
    @OneToMany(mappedBy = "seanceModule")
    private Set<Seance> seances_module = new HashSet<>();
}
