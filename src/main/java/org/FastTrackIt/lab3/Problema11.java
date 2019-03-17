package org.FastTrackIt.lab3;

import java.util.Scanner;

public class Problema11 {
    //Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
    //int n = 20; //sau o alta valoare

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Numarul ales: ");
         a= input.nextInt();
        int sum = (a*(a+1)/2);
        System.out.println("Rezultatul este: " + sum);
    }


}
