package org.FastTrackIt.lab3;

import java.util.Scanner;

    public class Problema4 {
    //Sa se genereze o tabla a inmultirii cu N, unde N este citit de la tastatura.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int TablaInmultirii;
        System.out.println("Alege un numar: ");
        b = input.nextInt();
        for (a = 0; a <= 10; a++) {


            TablaInmultirii = a * b;
            System.out.println(" " + a + "*" + b + "=" + TablaInmultirii);
        }
    }
}

