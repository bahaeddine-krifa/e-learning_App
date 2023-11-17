package com.coursspring.application_e_learning_01.modele;

public class Objectif {
    private int id;
    private int ordre;
    private String desc;
    private String txt;
    private Chapitre chap;

    public Objectif() {
    }

    public Objectif(int id, int ordre, String desc, String txt, Chapitre chap) {
        this.id = id;
        this.ordre = ordre;
        this.desc = desc;
        this.txt = txt;
        this.chap = chap;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Chapitre getChap() {
        return chap;
    }

    public void setChap(Chapitre chap) {
        this.chap = chap;
    }
}
