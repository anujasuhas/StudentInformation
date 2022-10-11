package com.example.Student.controller;

import com.example.Student.modal.StudentMarkListBean;
import com.example.Student.repository.StudentMarkListRepository;
import com.example.Student.service.StudentMarkListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/mark")
public class StudentMarkListController {

    @Autowired
    StudentMarkListServiceImpl studentMarkListService;
    @PostMapping
    public ResponseEntity<StudentMarkListBean> save(@RequestBody StudentMarkListBean studentMarkListBean) {
            return studentMarkListService.save(studentMarkListBean);

        }

    @GetMapping("{studentId}")
    public List<StudentMarkListBean> getStudentInformationById(@PathVariable int studentId)
    {
        return studentMarkListService.getStudentInformationById(studentId);
    }
    @RequestMapping(value="delete/{studentId}",method = RequestMethod.PUT)
    public List<StudentMarkListBean> deleteStudentInformationByStudentId(@PathVariable int studentId)
    {
        return studentMarkListService.deleteStud(studentId);
    }
    @RequestMapping(value="/by/delete/{id}",method = RequestMethod.PUT)
    public StudentMarkListBean deleteStudentInformationById(@PathVariable Long id)
    {

        return studentMarkListService.delete(id);
    }


}
