package Projet.integre.Gestion_Absence.Domains;

import Projet.integre.Gestion_Absence.Enumerations.Affirmation;
//import Projet.integre.Gestion_Absence.Repositories.Heure;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
public class Absence {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_absence;

    @Enumerated(EnumType.STRING)
    private Affirmation affirmation;

    @ManyToOne
    @JoinColumn(name = "id_etudiant")
    private Etudiant absenceEtudiant;
    @ManyToOne
    @JoinColumn(name = "id_seance")
    private Seance absenceSeance;
}
