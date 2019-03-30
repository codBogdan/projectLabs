package org.FastTrackIt.lab5homework;

public class Trimble extends GPS {

    private String name;
    private double precizie;
    private int utilizareTimp;
    private int yearOfManufacture;




    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Trimble(String name, double precizie, int utilizareTimp, int yearOfManufacture){
        super(name,precizie,utilizareTimp);
        this.yearOfManufacture=yearOfManufacture;
    }


}
