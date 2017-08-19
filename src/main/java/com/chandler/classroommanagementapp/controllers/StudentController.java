package com.chandler.classroommanagementapp.controllers;

import com.chandler.classroommanagementapp.data.ClassroomDAO;
import com.chandler.classroommanagementapp.data.StudentDAO;
import com.chandler.classroommanagementapp.forms.Classroom;
import com.chandler.classroommanagementapp.forms.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by davidprince on 7/31/17.
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentDAO studentDAO;

    @Autowired
    ClassroomDAO classroomDAO;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("students", studentDAO.findAll());
        model.addAttribute("title", "All Students: ");
        return "student/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddStudentForm(Model model) {
        model.addAttribute("title", "Add Student");
        model.addAttribute(new Student());
        model.addAttribute("classrooms", classroomDAO.findAll());
        return "student/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddStudentForm(@ModelAttribute @Valid Student newStudent,
                                       Errors errors, @RequestParam int classroomID, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Student");
            model.addAttribute("classrooms", classroomDAO.findAll());
            return "student/add";
        }

        Classroom cat = classroomDAO.findOne(classroomID);
        newStudent.setClassroom(cat);
        studentDAO.save(newStudent);
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveStudentForm(Model model) {
        model.addAttribute("students", studentDAO.findAll());
        model.addAttribute("title", "Remove Student");
        return "student/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveStudentForm(@RequestParam int[] id) {

        for (int aid : id) {
            studentDAO.delete(aid);
        }

        return "redirect:";
    }

    @RequestMapping(value = "classroom", method = RequestMethod.GET)
    public String classroom(Model model, @RequestParam int id) {

        Classroom cat = classroomDAO.findOne(id);
        List<Student> students = cat.getStudents();
        model.addAttribute("students", students);
        model.addAttribute("title", "Students in Class " + cat.getName());
        return "student/index";
    }

}
