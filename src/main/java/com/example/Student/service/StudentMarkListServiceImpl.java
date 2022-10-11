package com.example.Student.service;

import com.example.Student.exception.ResourceNotFoundException;
import com.example.Student.modal.StudentMarkListBean;
import com.example.Student.repository.StudentMarkListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentMarkListServiceImpl implements StudentMarkListService{
    @Autowired
    StudentMarkListRepository studentMarkListRepository;
    @Override
    public ResponseEntity<StudentMarkListBean> save(StudentMarkListBean studentMarkListBean) {
        if (studentMarkListBean.getId() == 0) {
            String grade = "";
            studentMarkListBean.setPercentage(studentMarkListBean.getMark());
            switch (studentMarkListBean.getPercentage() / 10) {
                case 10:
                case 9:
                    grade = "Grade: A";
                    break;

                case 8:
                    grade = "Grade: B";
                    break;

                case 7:
                    grade = "Grade: C";
                    break;

                case 6:
                    grade = "Grade: D";
                    break;

                case 5:
                    grade = "Grade: E";
                    break;

                default:
                    grade = "Grade: F";
                    break;

            }
            studentMarkListBean.setStatus(1);
            studentMarkListBean.setGrade(grade);
            studentMarkListBean.setCreatedOn(new Date());
        } else {
            String grade = "";
            studentMarkListBean.setPercentage(studentMarkListBean.getMark());
            switch (studentMarkListBean.getPercentage() / 10) {
                case 10:
                case 9:
                    grade = "Grade: A";
                    break;

                case 8:
                    grade = "Grade: B";
                    break;

                case 7:
                    grade = "Grade: C";
                    break;

                case 6:
                    grade = "Grade: D";
                    break;

                case 5:
                    grade = "Grade: E";
                    break;

                default:
                    grade = "Grade: F";
                    break;

            }
            studentMarkListBean.setStatus(1);
            studentMarkListBean.setGrade(grade);

        }
        studentMarkListBean=studentMarkListRepository.save(studentMarkListBean);

        return ResponseEntity.ok(studentMarkListBean);
    }

    public StudentMarkListBean delete(Long id){
        StudentMarkListBean studentMarkListBean=studentMarkListRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Student  id does not exist"+id));
        studentMarkListBean.setStatus(0);
        studentMarkListRepository.save(studentMarkListBean);
        return studentMarkListBean;
    }
    public List<StudentMarkListBean> deleteStud(int studentId)
    {
        List<StudentMarkListBean> listStudentMarkListBean=studentMarkListRepository.findAllByStudentId(studentId);
        for(StudentMarkListBean studentMarlListBean :listStudentMarkListBean)
        {
            studentMarlListBean.setStatus(0);
            studentMarkListRepository.save(studentMarlListBean);
        }

        return listStudentMarkListBean;
    }
    public List<StudentMarkListBean> getStudentInformationById(int studentId)
    {
        List<StudentMarkListBean> listStudentMarkListbean=studentMarkListRepository.findAllByStudentId(studentId);
        return(listStudentMarkListbean);
    }
}
