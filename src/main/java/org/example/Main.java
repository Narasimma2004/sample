package org.example;
public class Main {

    public String getString(Second second){
        return second.getSampleString() + second.getSecondString();
    }

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i +" th " + new Main().getString(new Second()));
        }
    }
}
