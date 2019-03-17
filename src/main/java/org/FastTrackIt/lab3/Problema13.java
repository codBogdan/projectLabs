package org.FastTrackIt.lab3;

import java.util.Scanner;

public class Problema13 {
    //Se da un numar . se se afiseze true daca numrul apartine intervalului [9,24] , altfel sa se afiseze true.


    public static void main(String[] arg){
        Scanner numar = new Scanner(System.in);
        System.out.println("Numarul: ");
        int a = numar.nextInt();
        if (a >9 && a<24)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
