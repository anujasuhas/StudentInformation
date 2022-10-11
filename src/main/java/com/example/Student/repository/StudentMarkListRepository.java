package com.example.Student.repository;

import com.example.Student.modal.StudentMarkListBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.List;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public interface StudentMarkListRepository extends JpaRepository<StudentMarkListBean,Long>  {
    List<StudentMarkListBean>  findAllByStudentId(int studentId);
}
