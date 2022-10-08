package com.amigoscode.amigoscodesbtfc2n20210110.student;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


// START: STUDENT CLASS = = = = = = = =
@Entity
@Table
public class Student {
    // Start: Attributes - - - - - - - - - -
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    
    private Long id;
    private String name;
    private String email;
    private LocalDate dob; //Date of Birth
    private Integer age;
    // End: Attributes - - - - - - - - - -


    // Start: Constructors - - - - - - - - - -
    public Student() {}

    public Student(
        Long id, 
        String name, 
        String email, 
        LocalDate dob, 
        Integer age
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(
        String name, 
        String email, 
        LocalDate dob, 
        Integer age
    ) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    // End: Constructors - - - - - - - - - -

    // Start: Getters and Setters - - - - - - - - - -
    // Getter and Setter for Long id
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // Getter and Setter for String name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // Getter and Setter for String email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // Getter and Setter for LocalDate dob
    public LocalDate getDob(){
        return dob;
    }
    public void setDob(LocalDate dob){
        this.dob = dob;
    }

    // Getter and Setter for Integer age
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    // End: Getters and Setters - - - - - - - - - -

    // Start: Other Methods - - - - - - - - - -
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", dob=" + dob +
                ", age=" + age +
                "}";
    }
    // End: Other Methods - - - - - - - - - -

}
// END: STUDENT CLASS = = = = = = = = = =

