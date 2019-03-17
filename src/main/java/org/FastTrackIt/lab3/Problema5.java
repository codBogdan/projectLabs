package org.FastTrackIt.lab3;

import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Sa se genereze o tabla a inmulturii intre N si M, unde N si M sunt citite de la tastatura.
        //De ex pentru N=3, si M = 6 se va genera table inmultirii cu 3, cu 4, cu 5 si cu 6

        int x, y, z, i;
        int TablaInmultirii;
        System.out.println("Numarul ales este: ");
        x = input.nextInt();
        y = input.nextInt();
        if (x < y) {
            for (z = x; z <= y; z++) {
                for (i = x; i <= y; i++) {

                }
                TablaInmultirii = i * z;
                System.out.println(" " + z + "*" + i + "=" + TablaInmultirii);
            }
        }else{
            for (z=y; z<=x; z++) {
                for (i = y; i <= x; i++) {

                    TablaInmultirii = i * z;
                    System.out.println(" " + z + "*" + i + "=" + TablaInmultirii);
                }


            }

        }
        }

    }







