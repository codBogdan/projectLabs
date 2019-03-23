package org.FastTrackIt.lab4;

import java.util.Scanner;

public class Problema9 {
    //Se da un sir de numere ordonate crescator.
    //Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
    //Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
    //sirul va fi definit asa, numerele sunt de exemplu.
    //int[] a = {1,3,4,6,7,8,10,12,14,23};



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int vizibil=0;
        System.out.println("Alegeti un numar din sirul de numere: ");
        n = input.nextInt();
        int[] a={1,3,4,8,9,12,16,20,25,26};
        int i;
        for (i=0; i<=9; i++){
            if (a[i] == n ){
                System.out.println("Numarul este pe pozitia: " + i);
                vizibil = 1;
            }
        }
        if(vizibil==0){
            System.out.println(-1);
        }

    }
}
