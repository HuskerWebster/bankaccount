package com.company;
import java.util.Date;



public abstract class Person {
    private String name;
    private Date dob;

    protected  Person (String name, Date dob){
        this.name = name;
        this.dob = dob;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getDob(){
        return dob;
    }

    @Override
    public String toString(){
        return name + " " +  dob;
    }

}
