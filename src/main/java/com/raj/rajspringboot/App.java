package com.raj.rajspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@ComponentScan("com.raj.rajspringboot")
@SpringBootApplication

public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    
}
