package Projet.integre.Gestion_Absence.Repositories;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface  Heure {
        int heures() default 0;
        int minutes() default 0;
        int secondes() default 0;
    }


