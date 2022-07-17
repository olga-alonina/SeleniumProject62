package com.cydeo.selenium.ClassTime.day13_configuration_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_Properties {
    @Test
    public void reading_from_properties_file() throws IOException {
        //create properties class object
        //We need properties class to use getKeys properties
        Properties properties = new Properties();
// create FileInputStream obj to open file as a stream in java memory
        FileInputStream file = new FileInputStream( "" );
        //load properties obj with the file we open using fileInputStream
        properties.load(file);
        //we can use  properties.getProperty method to read from file we loaded( configuration properties)
        System.out.println( "properties.getProperty( \"browser\" ) = " + properties.getProperty( "browser" ) );
        System.out.println( "properties.getProperty( \"env\" ) = " + properties.getProperty( "env" ) );
        System.out.println( "properties.getProperty( \"username\" ) = " + properties.getProperty( "username" ) );

    }

}
