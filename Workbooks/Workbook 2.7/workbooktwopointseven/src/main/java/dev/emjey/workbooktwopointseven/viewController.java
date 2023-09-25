package dev.emjey.workbooktwopointseven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// This file is made by EmJey
// Project: Workbook 2.7
// FileName: ViewController
// Date: 2023/09/25
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class viewController {

    @GetMapping("/")
    public String getView(Model model) {
        model.addAttribute("myName", "EmJeyDev");
        return "view";
    }
}
