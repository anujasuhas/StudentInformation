package com.example.Student.controller;

import com.example.Student.modal.StudentInformationBean;
import com.example.Student.service.StudentInformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/student")
public class StudentInformationController {

    @Autowired
    private StudentInformationServiceImpl studentInformationService;

    @GetMapping
    public List<StudentInformationBean> getAllStudentInformation()
    {
        return studentInformationService.getAllStudentInformation();
    }
    @PostMapping
    public ResponseEntity<StudentInformationBean> saveStudent(@RequestBody StudentInformationBean studentInformationBean) throws Exception {
        try{
            return studentInformationService.save(studentInformationBean);
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
    @GetMapping("{id}")
    public ResponseEntity<StudentInformationBean> getStudentInformationById(@PathVariable Long id)
    {
                return studentInformationService.getStudentInformationById(id);
    }
//    @PutMapping("{id}")
//    public ResponseEntity<StudentInformationBean> updateStudentInformation(@PathVariable Long id, @RequestBody StudentInformationBean updateStudentInformation)
//    {
//       return studentInformationService.updateStudentInformation(id,updateStudentInformation);
//    }
    @RequestMapping(value="delete/{id}",method = RequestMethod.PUT)
    public ResponseEntity<StudentInformationBean> deleteStudentInformationById(@PathVariable Long id) throws Exception {
        try{

        return studentInformationService.delete(id);
    } catch (Exception e) {
        throw new Exception(e);
    }
    }
}
