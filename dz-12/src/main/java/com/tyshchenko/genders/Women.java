package com.tyshchenko.genders;

public class Women extends Person {

    String previousLastname;

    public Women(String firstName, String lastName, int age, Boolean partner, String previousLastname) {
        super(firstName, lastName, age, partner);
        this.previousLastname = previousLastname;
    }

    public String getPreviousLastname() {
        return previousLastname;
    }

    public String setPreviousLastname(String previousLastname) {
        this.previousLastname = previousLastname;
        return previousLastname;
    }

    public boolean isRetired(){
        return getAge() > 60;
    }

    public void registerPartnership(Man man) {
        setLastName(man.getLastName());
        setPartner(true);
        man.setPartner(true);
    }

    public void deregisterPartnership(Man man) {
        setLastName(previousLastname);
        setPartner(false);
        man.setPartner(false);
    }

}
