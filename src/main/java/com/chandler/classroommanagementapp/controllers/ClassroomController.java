package com.chandler.classroommanagementapp.controllers;

import com.chandler.classroommanagementapp.models.data.ClassroomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by davidprince on 7/31/17.
 */

@Controller
@RequestMapping("Classroom")
public class ClassroomController {

    @Autowired
    private ClassroomDAO classroomDAO;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String index(Model model, @RequestParam(defaultValue = "0") int id){
        model.addAttribute("title", "Classrooms");
        model.addAttribute("Classrooms", classroomDAO.findAll());
        return "classroom/index";
    }
}
