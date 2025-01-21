package org.example;

public class Second extends Sample{

    private final String secondString;

    Second(){
        super();
        secondString = "From second";
    }

    public String getSecondString(){
        return secondString;
    }

}
