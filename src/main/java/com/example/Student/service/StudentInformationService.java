package com.example.Student.service;

import com.example.Student.modal.StudentInformationBean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentInformationService {
    public ResponseEntity<StudentInformationBean> save(StudentInformationBean studentInformationBean);
    public ResponseEntity<StudentInformationBean> getStudentInformationById(Long id);
    public ResponseEntity<StudentInformationBean> delete(Long id);
    public List<StudentInformationBean> getAllStudentInformation();
    public ResponseEntity<StudentInformationBean> updateStudentInformation(Long id,StudentInformationBean updateStudentInformation);

}
