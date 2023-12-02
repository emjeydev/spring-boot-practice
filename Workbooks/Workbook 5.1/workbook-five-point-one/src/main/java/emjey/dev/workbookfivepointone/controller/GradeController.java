package emjey.dev.workbookfivepointone.controller;


import emjey.dev.workbookfivepointone.pojo.Grade;
import emjey.dev.workbookfivepointone.service.GradeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// This file is made by EmJey
// Project: Workbook 5.1
// FileName: GradeController.java
// Date: 2023/12/02
// Modified Date: 2023/1/02
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class GradeController {

    @Autowired
    GradeService gradeService;

    @GetMapping("/")
    public String gradeForm(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("grade", gradeService.getGradeById(id));
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Grade grade, BindingResult result) {
        if (result.hasErrors()) return "form";
        gradeService.submitGrade(grade);
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", gradeService.getGrades());
        return "grades";
    }


}