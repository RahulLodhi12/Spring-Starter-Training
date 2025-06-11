package org.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//@Component //By Default id is "student", but we can give custom id names as well by @Component("abcd")
//It means we don't need to create bean for this "Student" class
@Component("abcd")
@PropertySource("classpath:values.properties")
public class Student {

    @Value("${db.userName}") //It's an injection without @Autowired, injection done via [value.properties]
    private String username;
    @Value("customDriver")
    private String driverName;

    @Autowired
    @Qualifier("getOtherNames")
    private List<String> allNames; //Injection via byType, byName

    private String name="aryan";
    private int age=12;

//    @Autowired
    private Address address;

    //Autowired by constructor -> If there is 1 constructor with matching "Address" (which need to be autowired),
    // we don't need to write @Autowired
    public Student(Address address){
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", driverName='" + driverName + '\'' +
                ", allNames=" + allNames +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
