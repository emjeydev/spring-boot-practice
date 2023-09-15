package dev.emjey.workbooktwopointthreetoseven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//    This file is made by EmJey
//    Project: Workbook2.3 and 2.4
//    FileName: SpeedController
//    Date: 2023/09/15
//    Email: emjeydev@gmail.com
//    Github: emjeydev

@Controller
public class SpeedController {

    @GetMapping("/sign")
    public String showSign(Model model) {
        model.addAttribute("speed", 45);
        return "sign";
    }
}
