package org.FastTrackIt.lab6homework;

import java.util.HashSet;
import java.util.Set;

//b.) Sa se contruiasca o colectie de elemente unice folosind set.
//Creati clasa Person care sa aiba fieldul nume ca si string.
//Sa se adauge in set urmatoarele obiecte : new Person(“Ion”), new Person(“Ana”), new Person(“Ion”).
//Cate elemente veti avea in set si de ce ?
//Suprascrieti (override) method equals (mostenita by default de la Object in java )
//@Override
//public boolean equals(Object obj) {
//
//    return nume.equals(((Person)obj).getNume());
//}
//Rulati din nou programul. Cate elemente aveti in lista si de ce ?
//
//Ce metoda trebuie sa supracriem automat daca am suprascis equals? => hashCode = > pt Map


//o sa avem doar 3 elemente afisate, deoarece fiecare are un  obiect atribuit. Dupa ce suprascriem methoda equals,
//elementele afisate nu se vor dubla si o sa avem doar 2 nume pe ecran.
// Set ordoneaza automat in ordine alfabetica elementele.



public class MainClassPerson {
    public static void main (String args[]){


        Set<Person> list = new HashSet<>();
        Person a1 = new Person("Ion");
        Person a2 = new Person("Ana");
        Person a3 = new Person("Ion");


        list.add(a1);
        list.add(a2);
        list.add(a3);


        for (Person pers : list) {
            System.out.println(pers);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }



}
