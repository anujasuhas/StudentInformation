package com.example.Student.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_information")
public class StudentInformationBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="address")
    private String address;

    @Column(name="place")
    private String place;

    @Column(name="email")
    private String email;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "name_father")
    private String  nameFather;

    @Column(name = "name_mother")
    private String  nameMother;

    @Column(name = "mother_mobile_number")
    private String  motherMobileNumber;

    @Column(name = "father_mobile_number")
    private String  fatherMobileNumber;

    @Column(name="status")
    private int status;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdOn;

    @Column(name = "updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedOn;




}

