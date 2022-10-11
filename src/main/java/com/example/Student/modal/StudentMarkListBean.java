package com.example.Student.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_mark_list")
public class StudentMarkListBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="subject")
    private String subject;

    @Column(name="mark")
    private int mark;

    @Column(name="percentage")
    private int percentage;

    @Column(name="grade")
    private String  grade;

    @Column(name="student_id")
    private int studentId;

    @Column(name="status")
    private int status;

    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdOn;

    @Column(name = "updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedOn;


}
