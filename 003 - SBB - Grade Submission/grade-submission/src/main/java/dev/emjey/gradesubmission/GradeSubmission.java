package dev.emjey.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

// This file is made by EmJey
// Project: GradeSubmission.java
// FileName: RecordController.java
// Date: 2023/09/11
// Modified Date: 2023/10/01
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class GradeSubmission {

    List<Grade> studentList = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("grade", new Grade());
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(Grade grade) {
        studentList.add(grade);
        System.out.println(grade);
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
//        studentList.add(new Grade("Harry", "Potion", "C-"));
//        studentList.add(new Grade("Hermione", "Arithmancy", "A+"));
//        studentList.add(new Grade("Neville", "Charms", "A-"));

        model.addAttribute("grades",studentList);
        return "grades";
    }
}
