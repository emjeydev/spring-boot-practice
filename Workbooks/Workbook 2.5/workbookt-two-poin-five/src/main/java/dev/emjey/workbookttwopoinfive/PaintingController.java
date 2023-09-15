package dev.emjey.workbookttwopoinfive;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// This file is made by EmJey
// Project: Workbook 2.5
// FileName: PaintingController
// Date: 2023/09/15
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class PaintingController {
    @GetMapping("/painting")
    public String getPainting(Model model) {
        model.addAttribute("painting", "starry-night");
        return "painting";
    }
}
