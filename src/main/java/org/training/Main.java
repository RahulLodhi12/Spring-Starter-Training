package org.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Steps:
        //1. Load the Context
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsConfig.xml");

        //2. Get a Reference to the bean
//        IPL ipl = context.getBean("ipl",IPL.class);
//        Engineer engineer = context.getBean("engineer",Engineer.class);
//        WWE wwe = context.getBean("wwe",WWE.class);
//        WWE wwe1 = context.getBean("wwe",WWE.class);

        //Annotations:
        AnnotationsEngineer annotationsEngineer = context.getBean("anEngineer",AnnotationsEngineer.class);
        Student student = context.getBean("abcd",Student.class);

        //3.Call methods on the bean
//        System.out.println(ipl.toString());
//        System.out.println(engineer.toString());
//        System.out.println(wwe.toString());

        //since I make, "WWE" bean scope="prototype", then we have 2 different objects. -> (wwe,wwe1)
//        System.out.println(wwe==wwe1); //false -> different reference

//        context.close(); //calls the destroy-method

        //Annotations:
        System.out.println(annotationsEngineer.toString());
        annotationsEngineer.someMethod();
        System.out.println(student.toString());
    }

    @Bean
    @Primary
    public List<String> getAllNames(){
        return Arrays.asList("mohit","tinku","mukesh");
    }

    @Bean
    public List<String> getOtherNames(){
        return Arrays.asList("abdul","junaid","saif");
    }

    //@Primary -> added with "methods" only
    //@Qualifier -> added via Injection
}