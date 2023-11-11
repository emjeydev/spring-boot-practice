package dev.emjey.gradesubmission.Controller;

import dev.emjey.gradesubmission.Constants;
import dev.emjey.gradesubmission.Grade;
import dev.emjey.gradesubmission.Repository.GradeSubmissionRepository;
import dev.emjey.gradesubmission.Service.GradeSubmissionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

// This file is made by EmJey
// Project: GradeSubmission.java
// FileName: RecordController.java
// Date: 2023/09/11
// Modified Date: 2023/10/02
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class GradeSubmissionController {

    GradeSubmissionService gradeSubmissionService = new GradeSubmissionService();

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = gradeSubmissionService.getGradeIndex(id);

        model.addAttribute("grade", gradeSubmissionService.getGradeById(id));
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Grade grade, BindingResult result) {
        if (result.hasErrors())
            return "form";
        gradeSubmissionService.submitGrade(grade);
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
//        studentList.add(new Grade("Harry", "Potion", "C-"));
//        studentList.add(new Grade("Hermione", "Arithmancy", "A+"));
//        studentList.add(new Grade("Neville", "Charms", "A-"));

        model.addAttribute("grades", gradeSubmissionService.getGrades());
        return "grades";
    }


}
