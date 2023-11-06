package dev.emjey.workbookthreepointone;

// This file is made by EmJey
// Project: WorkbookThreePointOne.java
// FileName: WorkbookController.java
// Date: 2023/11/06
// Modified Date: 2023/11/06
// Email: emjeydev@gmail.com
// Github: emjeydev

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WorkbookController {
    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("user", new User());
        return "sign-up";
    }

    @GetMapping("result")
    public String getResult() {
        return "result";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(@Valid User user, BindingResult result) {
        if (result.hasErrors())
            return "sign-up";
        return "redirect:/result";
    }
}
