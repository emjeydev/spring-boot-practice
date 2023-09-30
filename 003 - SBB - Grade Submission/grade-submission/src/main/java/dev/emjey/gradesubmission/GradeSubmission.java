package dev.emjey.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class GradeSubmission {

    List<Grade> studentList = Arrays.asList(
            new Grade("Harry", "Potion", "C-"),
            new Grade("Hermione", "Arithmancy", "A+"),
            new Grade("Neville", "Charms", "A-")
    );

    @GetMapping("/grades")
    public String getGrades(Model model) {
//        studentList.add(new Grade("Harry", "Potion", "C-"));
//        studentList.add(new Grade("Hermione", "Arithmancy", "A+"));
//        studentList.add(new Grade("Neville", "Charms", "A-"));

        model.addAttribute("grades",studentList);
        return "grades";
    }
}
