package org.vishalsoft.registrationmvc.model;

public class Student {
    private String name;
    private String email;
    private String city;
    public Student(String name,String email,String city){
        this.name=name;
        this.city=city;
        this.email=email;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getName() {return  this.name;}
    public String getEmail(){return this.email;}
    public String getCity(){return this.city;}


}
