package org.FastTrackIt.lab5homework;

import javax.sound.midi.Soundbank;

public class GPS {
    private String name;
    private double precizie;
    private int utilizareTimp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecizie() {
        return precizie;
    }

    public void setPrecizie(double precizie) {
        this.precizie = precizie;
    }

    public int getUtilizareTimp() {
        return utilizareTimp;
    }

    public void setUtilizareTimp(int utilizareTimp) {
        this.utilizareTimp = utilizareTimp;
    }


    //Constructor default
    public GPS(){
        name ="GPS";
        precizie = 1;
        utilizareTimp = 12;
    }

    public String toString(){
        return name + " cu precizia apropiata de " + precizie + "cm" + " si cu un timp de " + utilizareTimp + "h "
                +" este cel mai bun.";
    }



    public GPS(String name,double precizie, int utilizareTimp){
        this.name=name;
        this.precizie=precizie;
        this.utilizareTimp=utilizareTimp;
    }




}






