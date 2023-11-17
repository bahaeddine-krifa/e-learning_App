package com.coursspring.application_e_learning_01.repository;

import com.coursspring.application_e_learning_01.modele.Candidat;
import com.coursspring.application_e_learning_01.modele.Chapitre;
import com.coursspring.application_e_learning_01.modele.Objectif;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class learningRepo {

    public List<Candidat> getAllCondidat() {
        List<Candidat> candidats = LesListes.candidats;
        return candidats;
    }
    public List<Chapitre> getAllChapitre() {
        List<Chapitre> chapitres = LesListes.chapitres;
        return chapitres;
    }
    public List<Objectif> getAllObject(int id) {
        int nb= id-1;
        List<Objectif> objectifs1 = new ArrayList<>();
        Chapitre chapitre= LesListes.chapitres.get(nb);
        //Objectif objectif= LesListes.objectifs.get(0);
        List<Objectif> objectifs = LesListes.objectifs;
        for (int i=0;i<objectifs.size();i++){
            Objectif objectif= LesListes.objectifs.get(i);
            Chapitre chapitre1 = objectif.getChap();
            if(chapitre.equals(chapitre1)){
                objectifs1.add(objectif);
            }
        }
        return objectifs1;
    }

    public void addCondidat(Candidat candidat) {
        List<Candidat> candidats = LesListes.candidats;
        candidat.setId(candidats.size()+1);
        candidats.add(candidat);
    }
    public void addChapitre(Chapitre chapitre) {
        List<Chapitre> chapitres = LesListes.chapitres;
        chapitre.setId(chapitres.size()+1);
        chapitres.add(chapitre);
    }

    public Candidat getCandidatById(int id) {
        List<Candidat> candidats = LesListes.candidats;
        Candidat candidat = candidats.get(id-1);
        return candidat;
    }

    public Chapitre getChapitreById(int id) {
        List<Chapitre> chapitres = LesListes.chapitres;
        Chapitre chapitre = chapitres.get(id-1);
        return  chapitre;
    }
    public void updateCandidat(Candidat candidat) {
        List<Candidat> candidats = LesListes.candidats;
        Candidat candidat1 = candidats.get(candidat.getId()-1);
        candidats.remove(candidat1);
        candidat.setId(candidat.getId());
        candidats.add(candidats.indexOf(candidat1)+1,candidat);

    }

    public void updateChapitre(Chapitre chapitre) {
        List<Chapitre> chapitres = LesListes.chapitres;
        Chapitre chapitre1 = chapitres.get(chapitre.getId()-1);
        chapitres.remove(chapitre1);
        chapitre.setId(chapitre.getId());
        chapitres.add(chapitres.indexOf(chapitre1)+1,chapitre);
    }

    public void deleteCandidat(int id) {
        List<Candidat> candidats = LesListes.candidats;
        candidats.remove(id-1);
    }

    public void deleteChapitre(int id) {
        List<Chapitre> chapitres = LesListes.chapitres;
        chapitres.remove(id-1);
    }

}
