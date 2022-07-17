package com.cydeo.selenium.ClassTime.Day14_driverUtil_javaFaker;

import org.testng.annotations.Test;

public class SingletonPractice {
    @Test
    public void Singleton_understanding_test(){
        String word = Singleton.getWord();
        System.out.println( "word = " + word );

        String word2 = Singleton.getWord();
        System.out.println( "word2 = " + word2 );
    }
}
