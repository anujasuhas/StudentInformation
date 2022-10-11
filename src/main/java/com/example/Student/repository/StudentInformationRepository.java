package com.example.Student.repository;

import com.example.Student.modal.StudentInformationBean;
import com.example.Student.modal.StudentMarkListBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public interface StudentInformationRepository extends JpaRepository<StudentInformationBean,Long> {

}
