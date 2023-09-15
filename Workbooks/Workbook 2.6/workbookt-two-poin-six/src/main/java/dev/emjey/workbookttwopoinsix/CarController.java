package dev.emjey.workbookttwopoinsix;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// This file is made by EmJey
// Project: Workbook 2.6
// FileName: CarController
// Date: 2023/09/15
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class CarController {
    @GetMapping("/car")
    public String getCars(Model model) {
//Test Case 01
        model.addAttribute("budget", 4000);
        model.addAttribute("make", "Toyota");
//Test Case 02
        model.addAttribute("budget", 10000);
        model.addAttribute("make", "Toyota");
//Test Case 03
        model.addAttribute("budget", 10000);
        model.addAttribute("make", "Subaru");
        return "car";
    }
}
