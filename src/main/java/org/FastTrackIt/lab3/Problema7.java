package org.FastTrackIt.lab3;

import java.util.Scanner;

public class Problema7 {

//Se da un numar a. Se se afiseze numarul invers


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x;
        int inv=0;
        System.out.println("Alege un sir de numere: ");
        x=input.nextInt();
        while (x!=0){
            inv=inv*10+(x%10);
            x=x/10;
        }
        System.out.println("Rezultat: " + inv);
    }



}
