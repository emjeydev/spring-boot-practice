package dev.emjey.gradesubmission.Controller;

import dev.emjey.gradesubmission.Constants;
import dev.emjey.gradesubmission.Grade;
import dev.emjey.gradesubmission.Repository.GradeSubmissionRepository;
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

    @Autowired
    GradeSubmissionRepository gradeSubmissionRepository;

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = getGradeIndex(id);

        model.addAttribute("grade", index == Constants.NOT_FOUND ? new Grade() :
                gradeSubmissionRepository.getGrade(index));
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Grade grade, BindingResult result) {
        if (result.hasErrors())
            return "form";
        int index = getGradeIndex(grade.getId());
        if (index == Constants.NOT_FOUND) {
            gradeSubmissionRepository.addGrade(grade);
        } else {
            gradeSubmissionRepository.updateGrade(grade, index);
        }
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
//        studentList.add(new Grade("Harry", "Potion", "C-"));
//        studentList.add(new Grade("Hermione", "Arithmancy", "A+"));
//        studentList.add(new Grade("Neville", "Charms", "A-"));

        model.addAttribute("grades", gradeSubmissionRepository.getGrades());
        return "grades";
    }

    public Integer getGradeIndex(String id) {
        for (int i = 0; i < gradeSubmissionRepository.getGrades().size(); i++) {
            if (gradeSubmissionRepository.getGrades().get(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }
}
