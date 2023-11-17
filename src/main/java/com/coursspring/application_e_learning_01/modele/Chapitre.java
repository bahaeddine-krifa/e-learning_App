package com.coursspring.application_e_learning_01.modele;

public class Chapitre {
    private int id;
    private int ordre;
    private String nomChap;

    public Chapitre() {
    }

    public Chapitre(int id, int ordre, String nomChap) {
        this.id = id;
        this.ordre = ordre;
        this.nomChap = nomChap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public String getNomChap() {
        return nomChap;
    }

    public void setNomChap(String nomChap) {
        this.nomChap = nomChap;
    }
}
