package com.example.Student.service;

import com.example.Student.modal.StudentMarkListBean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentMarkListService {
    public ResponseEntity<StudentMarkListBean> save(StudentMarkListBean studentMarkListBean);
    public StudentMarkListBean delete(Long id);
    public List<StudentMarkListBean> deleteStud(int studentId);
    public List<StudentMarkListBean> getStudentInformationById(int studentId);
}
