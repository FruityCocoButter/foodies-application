package com.example.foodies;
public class Customer {

    String name;
    String Surname;
    String reward;

    Customer(String name, String Surname){

        this.name=name;
        this.Surname=Surname;

    }

    String getName(){

        return name;
    }

    String getSurname(){

        return Surname;
    }

    String getReward(){

      return reward;
    }

    void setReward(String reward){

      this.reward = reward;
    }

    boolean checkTypeOfCustomer(String person_number){

        return Character.isDigit(person_number.charAt(0));
    }

    public boolean equals(Customer customer){

        return customer.getName().equalsIgnoreCase(this.name) && customer.getSurname().equalsIgnoreCase(this.Surname);
    }

    public String toString(){

        return name + " " + Surname;
    }

}
