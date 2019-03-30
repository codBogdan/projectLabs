package org.FastTrackIt.lab5homework;

public class mainClass {


    public static void main(String[] args){


            GPS gps1 = new GPS("GPS",1, 12);
            System.out.println(gps1.getName()+" are o precizie maxima de "+gps1.getPrecizie()+" cm " + " si un timp de utilizare de "
            +gps1.getUtilizareTimp()+"h.");

            GPS a = new GPS("GPS", 0.20, 13);
            System.out.println("Daca aparatul depaseste tolerantele impuse de catre fabricant atunci sunt probleme serioase.");


            GPS gps = new GPS();
            System.out.println(gps);

            Stonex stonex = new Stonex("Stonex",1.10,6, 2010);
            System.out.println(stonex.getName()+" are precizia de "+stonex.getPrecizie()+ "cm "+", anul de fabricatie "
                    +stonex.getYearOfManufacture() + " iar timpul de utilizare continua este de "+stonex.getUtilizareTimp()
            +"h.");

            Trimble trimble = new Trimble("Trimble ",0.20, 10, 2012);
            System.out.println(trimble.getName()+ " are o precizie de "+trimble.getPrecizie()+ "mm "+", anul de fabricatie "
            + trimble.getYearOfManufacture()+ " iar timpul de utilizare continua este de "+ trimble.getUtilizareTimp()
            +"h.");
            
            mainClass aparat = new mainClass();
        System.out.println(aparat);

    }

    public mainClass(){

        double S = 1.10;
        double T = 0.29;
        if (S < 1){
            System.out.println("Aparatul Stonex intra in tolerante.");
        }else{
            System.out.println("Aparatul Stonex  nu intra in tolerante.");
        }
        if (T < 1) {
            System.out.println("Aparatul Trimble intra in tolerante.");
        }else{
            System.out.println("Aparatul Trimble nu intra in tolerante");
        }
        return;
    }

}
