package Projet.integre.Gestion_Absence.Domains;

//import Projet.integre.Gestion_Absence.Repositories.Heure;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Seance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_seance;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
//    @Heure(heures = 12, minutes = 30, secondes = 0)
    private String heure;
    @ManyToOne
    @JoinColumn(name = "id_enseignant")
    private Enseignant seanceEnseignant;
    @OneToMany(mappedBy = "absenceSeance")
    private Set<Absence> absences = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "id_module")
    private Module seanceModule;
}
