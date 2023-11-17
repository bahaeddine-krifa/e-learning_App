package com.coursspring.application_e_learning_01.controlleur;

import com.coursspring.application_e_learning_01.modele.Candidat;
import com.coursspring.application_e_learning_01.modele.Chapitre;
import com.coursspring.application_e_learning_01.service.learningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class learnigControlleur {
    @Autowired
    private learningService learningService;

    @GetMapping("/condidatList")
    public String listCandidat(Model model) {
        model.addAttribute("condidats", learningService.getAllCondidats());
        return "listCon";
    }

    @GetMapping("/chapitrList")
    public String listChapitre(Model model) {
        model.addAttribute("chapitres", learningService.getAllChapitres());
        return "listChap";
    }
    @GetMapping("/chapitrList/objectifsChapitre/{id}")
    public String listObjectif(@PathVariable int id,Model model) {
        model.addAttribute("objs",learningService.getAllObj(id));
        return "listObj";
    }

    @GetMapping("/ajouterCondidat")
    public String createCondidatForm(Model model) {
        Candidat candidat =new Candidat();
        model.addAttribute("condidat",candidat);
        return "ajoutCon";
    }

    @PostMapping("/condidatList")
    public String saveCondidat(@ModelAttribute("candidat") Candidat candidat) {
        learningService.addCondidat(candidat);
        return  "redirect:/condidatList";
    }

    @GetMapping("/ajouterChapitre")
    public String createChapitreForm(Model model) {
        Chapitre chapitre = new Chapitre();
        model.addAttribute("chapitre",chapitre);
        return "ajoutChap";
    }

    @PostMapping("/chapitrList")
    public String saveChapitre(@ModelAttribute("chapitre") Chapitre chapitre) {
        learningService.addChapitre(chapitre);
        return "redirect:/chapitrList";
    }

    @GetMapping("/condidatList/edit/{id}")
    public String editCandidatForm(@PathVariable int id,Model model) {
        model.addAttribute("candidat",learningService.getCandidatById(id));
        return "editCandidat";
    }

    @PostMapping("/condidatList/{id}")
    public String updateCandidat(@PathVariable int id,@ModelAttribute("candidat") Candidat candidat, Model model) {
        Candidat candidat1 = learningService.getCandidatById(id);
        candidat1.setId(id);
        candidat1.setNom(candidat.getNom());
        candidat1.setPrenom(candidat.getPrenom());
        candidat1.setEmail(candidat.getEmail());
        candidat1.setLogin(candidat.getLogin());
        candidat1.setPassword(candidat.getPassword());

        learningService.updateCandidat(candidat1);
        return "redirect:/condidatList";
    }
    @GetMapping("/condidatList/{id}")
    public String deleteCandidat(@PathVariable int id) {
        learningService.deleteCandidat(id);
        return "redirect:/condidatList";
    }

    @GetMapping("/chapitrList/edit/{id}")
    public String editChapitreForm(@PathVariable int id,Model model) {
        model.addAttribute("chapitre",learningService.getChapitreById(id));
        return "editChapitre";
    }

    @PostMapping("/chapitrList/{id}")
    public String updateChapitre(@PathVariable int id,@ModelAttribute("chapitre") Chapitre chapitre,Model model) {
        Chapitre chapitre1 = learningService.getChapitreById(id);
        chapitre1.setId(id);
        chapitre1.setOrdre(chapitre.getOrdre());
        chapitre1.setNomChap(chapitre.getNomChap());

        learningService.updateChapitre(chapitre1);
        return "redirect:/chapitrList";
    }

    @GetMapping("/chapitrList/{id}")
    public String deleteChapitre(@PathVariable int id) {
        learningService.deleteChapitre(id);
        return "redirect:/chapitrList";
    }
}
