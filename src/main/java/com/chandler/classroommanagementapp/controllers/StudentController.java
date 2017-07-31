package com.chandler.classroommanagementapp.controllers;

import com.chandler.classroommanagementapp.models.data.ClassroomDAO;
import com.chandler.classroommanagementapp.models.data.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by davidprince on 7/31/17.
 */
@Controller
@RequestMapping("")
public class StudentController {

    @Autowired
    StudentDAO studentDAO;

    @Autowired
    ClassroomDAO classroomDAO;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("students", studentDAO.findAll());
        model.addAttribute("title", "All Students: ");
        return "index";
    }



}
