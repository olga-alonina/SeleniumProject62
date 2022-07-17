package com.cydeo.selenium.ClassTime.Day9_Practice;

public class Singleton {
    //by making constructor private we are limited creating obj from this class
    private Singleton() {
    }

    //if we create it as private we could reach it only from Getter
    private static String word;

    //by creating get method  we allow user to reach String in our way
    public static String getWord() {
        if(word==null) {
            System.out.println( "First time call, word object is null" +"Assigning value to it now" );
            word = "Something";
        }else{
            System.out.println("We already have value.");
        }
        return word;
    }

    }

