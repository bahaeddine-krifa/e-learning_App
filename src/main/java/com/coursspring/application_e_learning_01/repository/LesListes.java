package com.coursspring.application_e_learning_01.repository;

import com.coursspring.application_e_learning_01.modele.Candidat;
import com.coursspring.application_e_learning_01.modele.Chapitre;
import com.coursspring.application_e_learning_01.modele.Instruction;
import com.coursspring.application_e_learning_01.modele.Objectif;

import java.util.ArrayList;
import java.util.List;

public class LesListes {
    public static List<Candidat> candidats = new ArrayList<Candidat>();
    static {
        candidats.add(new Candidat(1, "ali@gmail.com","Ali", "Saleh","loginali","passali"));
        candidats.add(new Candidat(2,"meriem@gmail.com","Meriem", "Besma","loginmeriem","passmeriem"));
    }

    public static List<Chapitre> chapitres = new ArrayList<>();
    static {
        chapitres.add(new Chapitre(1, 1,"Classes et objets"));
        chapitres.add(new Chapitre(2,3,"Héritage"));
        chapitres.add(new Chapitre(3,2,"Tableaux"));
        chapitres.add(new Chapitre(4,5,"Interface"));
        chapitres.add(new Chapitre(5,6,"Exception"));
        chapitres.add(new Chapitre(6,4,"Polymorphisme"));

    }

    public static List<Objectif> objectifs = new ArrayList<>();
    static {
        objectifs.add(new Objectif(1,1,"Principe de class","Une classe est ",chapitres.get(0)));
        objectifs.add(new Objectif(2,2,"Principe d'objets","Un objet classe est ",chapitres.get(0)));
        objectifs.add(new Objectif(3,3,"Le constructeur","Un Constructeur ",chapitres.get(0)));
        objectifs.add(new Objectif(4,1,"Principe d'héritage","L'héritage est ",chapitres.get(1)));
        objectifs.add(new Objectif(5,2,"Rédefinition","Rédefinition est  ",chapitres.get(1)));
        objectifs.add(new Objectif(6,1,"Tableau d'objets","Tableau d'objets est ",chapitres.get(2)));
        objectifs.add(new Objectif(7,2,"Tableau à deux dimensions","Tableau à deux dimensions est ",chapitres.get(2)));
    }

    public static List<Instruction> instructions = new ArrayList<>();
    static {
        instructions.add(new Instruction(1,1,"Le mot cle d'une classe en java","public classe ",objectifs.get(0)));
        instructions.add(new Instruction(2,2,"L'enete de la classe Point","public class Point ",objectifs.get(0)));
        instructions.add(new Instruction(3,1,"Definition d'un objet","Un objet est entite vivant",objectifs.get(1)));
        instructions.add(new Instruction(4,2,"Declare un objet de type Point","Point p=new Point()",objectifs.get(2)));
    }

}
