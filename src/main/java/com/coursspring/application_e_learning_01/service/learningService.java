package com.coursspring.application_e_learning_01.service;

import com.coursspring.application_e_learning_01.modele.Candidat;
import com.coursspring.application_e_learning_01.modele.Chapitre;
import com.coursspring.application_e_learning_01.modele.Objectif;
import com.coursspring.application_e_learning_01.repository.learningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class learningService {
    @Autowired
    private learningRepo learningRepo;

    public List<Candidat> getAllCondidats() {
        return learningRepo.getAllCondidat();
    }

    public List<Chapitre> getAllChapitres() {
        return learningRepo.getAllChapitre();
    }
    public List<Objectif> getAllObj(int id) {
        return learningRepo.getAllObject(id);
    }

    public void addCondidat(Candidat candidat) {
        learningRepo.addCondidat(candidat);
    }

    public  void addChapitre(Chapitre chapitre) {
        learningRepo.addChapitre(chapitre);
    }

    public Candidat getCandidatById(int id) {
        return  learningRepo.getCandidatById(id);
    }

    public void updateCandidat(Candidat candidat) {
        learningRepo.updateCandidat(candidat);
    }

    public void deleteCandidat(int id) {
        learningRepo.deleteCandidat(id);
    }

    public Chapitre getChapitreById(int id) {
        return learningRepo.getChapitreById(id);
    }

    public void updateChapitre(Chapitre chapitre) {
        learningRepo.updateChapitre(chapitre);
    }

    public void deleteChapitre(int id) {
        learningRepo.deleteChapitre(id);
    }
}
