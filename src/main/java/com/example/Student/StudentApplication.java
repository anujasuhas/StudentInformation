package com.example.Student;

import com.example.Student.modal.StudentInformationBean;
import com.example.Student.repository.StudentInformationRepository;
import com.example.Student.repository.StudentMarkListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Autowired
	StudentInformationRepository studentInformationRepository;

	@Override
	public void run(String... args) throws Exception {
		StudentInformationBean studentInformation=new StudentInformationBean();
		studentInformation.setId(1);
		studentInformation.setFirstName("Ann");
		studentInformation.setLastName("Maria");
		studentInformation.setAddress("Address Line1");
		studentInformation.setPlace("Place");
		studentInformation.setEmail("email@gmail.com");
		studentInformation.setMobileNumber("9087654321");
		studentInformation.setDateOfBirth(new Date(1990/11/11));
		studentInformation.setGender("female");
		studentInformation.setNameFather("father");
		studentInformation.setNameMother("mother");
		studentInformation.setFatherMobileNumber("9087654321");
		studentInformation.setMotherMobileNumber("9087654321");
		studentInformation.setStatus(1);
		studentInformation.setUsername("username");
		studentInformation.setPassword("password");
		//studentInformationRepository.save(studentInformation);

		StudentInformationBean studentInformation1=new StudentInformationBean();
		studentInformation1.setFirstName("Anna");
		studentInformation1.setLastName("Maria");
		studentInformation1.setAddress("Address Line1");
		studentInformation1.setPlace("Place");
		studentInformation1.setEmail("email@gmail.com");
		studentInformation1.setMobileNumber("9087654321");
		studentInformation1.setDateOfBirth(new Date(1990/11/11));
		studentInformation1.setGender("female");
		studentInformation1.setNameFather("father");
		studentInformation1.setNameMother("mother");
		studentInformation1.setFatherMobileNumber("9087654321");
		studentInformation1.setMotherMobileNumber("9087654321");
		studentInformation1.setStatus(1);
		studentInformation1.setUsername("username");
		studentInformation1.setPassword("password");

	//	studentInformationRepository.save(studentInformation1);
	}


}
