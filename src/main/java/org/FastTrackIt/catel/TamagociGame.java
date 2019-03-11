package org.FastTrackIt.catel;

public class TamagociGame {
    public static void main(String[] args){



        Catel dog1 = new Catel();
        dog1.setName("Rex");



        Catel dog2 = new Catel();
        dog2.setName("Rufus");


        for(int zi=0;zi<15;zi++) {
            System.out.println("zi");
            dog2.mananca();
            System.out.println(dog2.getVarsta());
            System.out.println("------------------------------");
        }


        System.out.println("Catelul"+ dog2.getName()+ "are varsta:" + dog2.getVarsta());


    }

}
