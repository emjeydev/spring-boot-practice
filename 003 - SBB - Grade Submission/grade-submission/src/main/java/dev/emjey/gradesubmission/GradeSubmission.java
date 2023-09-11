package dev.emjey.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeSubmission {

    @GetMapping("/grades")
    public String getGrades() {
        return "grades";
    }
}
