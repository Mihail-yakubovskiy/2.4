package com.company;
public class Dog {
    String name = "bob";
    int age=7;

    //@Override
    public String ToString(){
        return "Dog name: "+ name + "\nDog age: "+ age;
    }

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void SetAge(int age){
        this.age = age;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String GetName(){
        return name;
    }

    public int GetAge(){
        return age;
    }

    public int HumanAge(){
        return age*7;
    }

}
