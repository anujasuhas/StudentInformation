package com.example.Student.service;

import com.example.Student.exception.ResourceNotFoundException;
import com.example.Student.modal.StudentInformationBean;
import com.example.Student.repository.StudentInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class StudentInformationServiceImpl implements StudentInformationService{
    @Autowired
    StudentInformationRepository studentInformationRepository;

    @Override
    public ResponseEntity<StudentInformationBean> save(StudentInformationBean studentInformationBean) {
        if (studentInformationBean.getId() != 0) {
            studentInformationBean.setCreatedOn(new Date());

        } else {
            studentInformationBean.setUpdatedOn(new Date());
                   }
        studentInformationRepository.save(studentInformationBean);
        return ResponseEntity.ok(studentInformationBean);
    }
    @Override
    public ResponseEntity<StudentInformationBean> getStudentInformationById(Long id)
    {
        StudentInformationBean studentInformation=studentInformationRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Student  id does not exist"+id));
        return ResponseEntity.ok(studentInformation);
    }
    @Override
    public ResponseEntity<StudentInformationBean> delete(Long id) {
        StudentInformationBean studentBean=new StudentInformationBean();
        studentBean=studentInformationRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Student list id does not exist"+id));
        studentBean.setStatus(0);
        studentInformationRepository.save(studentBean);
        return ResponseEntity.ok(studentBean);
    }
    @Override
    public List<StudentInformationBean> getAllStudentInformation()
    {
        return studentInformationRepository.findAll();
    }

    @Override
    public ResponseEntity<StudentInformationBean> updateStudentInformation(Long id, StudentInformationBean updateStudentInformation) {
        return null;
    }
//    public ResponseEntity<StudentInformationBean> updateStudentInformation(Long id,StudentInformationBean updateStudentInformation)
//    {
//        StudentInformationBean studentInformation=studentInformationRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee id does not exist"+id));
//        studentInformation.setFirstName(updateStudentInformation.getFirstName());
//        studentInformation.setLastName(updateStudentInformation.getLastName());
//        studentInformation.setAddress(updateStudentInformation.getAddress());
//        studentInformation.setPlace(updateStudentInformation.getPlace());
//        studentInformation.setEmail(updateStudentInformation.getEmail());
//        studentInformation.setMobileNumber(updateStudentInformation.getMobileNumber());
//        studentInformation.setDateOfBirth(updateStudentInformation.getDateOfBirth());
//        studentInformation.setGender(updateStudentInformation.getGender());
//        studentInformation.setNameMother(updateStudentInformation.getNameMother());
//        studentInformation.setNameFather(updateStudentInformation.getNameFather());
//        studentInformation.setMotherMobileNumber(updateStudentInformation.getMotherMobileNumber());
//        studentInformation.setFatherMobileNumber(updateStudentInformation.getFatherMobileNumber());
//        studentInformation.setUsername(updateStudentInformation.getUsername());
//        studentInformation.setPassword(updateStudentInformation.getPassword());
//        studentInformationRepository.save(studentInformation);
//        return ResponseEntity.ok(updateStudentInformation);
//    }

}
