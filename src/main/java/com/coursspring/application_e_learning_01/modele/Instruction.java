package com.coursspring.application_e_learning_01.modele;

public class Instruction {
    private int id;
    private int ordre;
    private String desc;
    private String txt;
    private Objectif obj;

    public Instruction() {
    }

    public Instruction(int id, int ordre, String desc, String txt, Objectif obj) {
        this.id = id;
        this.ordre = ordre;
        this.desc = desc;
        this.txt = txt;
        this.obj = obj;
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

    public Objectif getObj() {
        return obj;
    }

    public void setObj(Objectif obj) {
        this.obj = obj;
    }
}
