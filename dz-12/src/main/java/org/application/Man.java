package org.application;

public class Man extends Person {

    public Man(String firstName, String lastName, int age, Boolean partner){

        super(firstName,lastName,age,partner);
    }

    public boolean isRetired(){
        return getAge() > 65;
    }


}
