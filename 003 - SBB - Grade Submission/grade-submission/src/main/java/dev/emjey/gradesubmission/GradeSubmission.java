package dev.emjey.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class GradeSubmission {

    List<Grade> studentList = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = getGradeIndex(id);

        model.addAttribute("grade", index == -1000 ? new Grade() : studentList.get(index));
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(Grade grade) {
        int index = getGradeIndex(grade.getId());
        if (index == -1000) {
            studentList.add(grade);
        } else {
            studentList.set(index, grade);
        }
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
//        studentList.add(new Grade("Harry", "Potion", "C-"));
//        studentList.add(new Grade("Hermione", "Arithmancy", "A+"));
//        studentList.add(new Grade("Neville", "Charms", "A-"));

        model.addAttribute("grades", studentList);
        return "grades";
    }

    public Integer getGradeIndex(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id))
                return i;
        }
        return -1000;
    }
}
