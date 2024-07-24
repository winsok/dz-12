package org.application;

public class Women extends Person {

    String previousLastname;

    public Women(String firstName, String lastName, int age, Boolean partner) {
        super(firstName, lastName, age, partner);
    }

    public String getPreviousLastname() {
        return previousLastname;
    }

    public void setPreviousLastname(String previousLastname) {
        this.previousLastname = previousLastname;
    }

    public boolean isRetired(){
        return getAge() > 65;
    }

    public void registerPartnership(Man man) {
        setLastName(man.getLastName());
        setPartner(true);
        man.setPartner(true);
    }

    public void deregisterPartnership(Man man) {
        setLastName(getPreviousLastname());
        setPartner(false);
        man.setPartner(false);
    }

}

