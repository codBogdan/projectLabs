package org.FastTrackIt.agenda.domain;

public class Contact {


    private String firstName;

    private String lastName;

    private String phone;

    private String adress;


    public Contact(){
        super ();
        phone = "";
    }


    public Contact(String firstNameParam, String lastNameParam){
        this();
        this.firstName = firstNameParam;
        this.lastName = lastNameParam;
    }


    public Contact(String firstName, String lastName, String adress){
        this(firstName, lastName);
        this.adress = adress;
    }


    public void setFirstName(String firstNameParam){
        //valida
        if (firstNameParam.equals("")){
            throw new IllegalArgumentException("First name cannot be empy");
        }
        this.firstName = firstNameParam;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "First name is: " + firstName + "and last name is:" + lastName;
    }

    public boolean equals(Object o){
        Contact second = (Contact)o;
        if (second.getFirstName().equals(this.firstName) && second.getLastName().equals(this.getLastName())){
            return true;
        }else{
            return false;
        }
    }



}
