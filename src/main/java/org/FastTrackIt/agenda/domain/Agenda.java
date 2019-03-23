package org.FastTrackIt.agenda.domain;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private String nameAgenda;
    private String owner;
    private Contact[] contacts = new Contact[20];
    private List <Contact> contactList = new ArrayList<Contact>();




    public static void main(String[] args){

        Agenda agenda = new Agenda();

        Contact contact0 = new Contact("Vasile","Muresan");
        Contact contact1 = new Contact("Pop","Vasi");


        Contact firstContact = new Contact();
        firstContact.setLastName("Pop");
        firstContact.setFirstName("Costel");
        System.out.println(firstContact.toString());


        agenda.getContactList().add(firstContact);

        agenda.contacts[0] = firstContact;

        Contact secondContact = new Contact();
        secondContact.setLastName("Pop");
        secondContact.setLastName("Ana");
        System.out.println(secondContact.toString());

        agenda.getContactList().add(secondContact);

        agenda.contacts[1] = secondContact;

        System.out.println("Check equals with == " + (secondContact == firstContact));
        System.out.println("Check equals with equals " +(secondContact.equals(firstContact)));
    }


    public String getNameAgenda() {
        return nameAgenda;
    }

    public void setNameAgenda(String nameAgenda) {
        this.nameAgenda = nameAgenda;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
