package org.FastTrackIt.lab6homework;

import java.util.HashSet;
import java.util.Set;

//2.	Ce foloseste colectia Set pt a identifica obiectele ca fiind unice?
        //Puteti scrie o miniproblema:
        //a.)Sa se contruiasca o colectie de elemente unice folosind Set:
        //Sa se apeleze metoda add din Set cu urmatoarele 5 numere: 1,2,3,4,4.
        //Cate elemente va avea setul si de ce ?
//se afiseaza 4 elemente, deoarece HashSet nu permite afiseara a elementelor duble, doar o singura data.




public class Ex2a {
    public static void main(String args[]){
        Set<Integer> numere = new HashSet<Integer>();
        numere.add(1);
        numere.add(2);
        numere.add(3);
        numere.add(4);
        numere.add(4);

        System.out.println(numere);
    }

}

