package dev.emjey.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeSubmission {

    @GetMapping("/grades")
    public String getGrades(Model model) {
        Grade grade = new Grade("Harry", "Potion", "C-");
        model.addAttribute("grade",grade);
        return "grades";
    }
}
