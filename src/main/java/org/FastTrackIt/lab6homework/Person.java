package org.FastTrackIt.lab6homework;

import java.util.Objects;

public class Person extends MainClassPerson {
    private String name;





    public Person(String nume){
        this.name = nume;


    }

    public String getName() {
        return getName();
    }

    public String toString(){
        return name;
    }




    public boolean equals(Object o) {
      if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }


    public int hashCode() {
        return Objects.hash(name);
    }
}
