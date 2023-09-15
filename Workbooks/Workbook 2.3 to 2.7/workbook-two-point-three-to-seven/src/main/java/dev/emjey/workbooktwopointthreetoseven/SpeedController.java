package dev.emjey.workbooktwopointthreetoseven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpeedController {

    @GetMapping("/sign")
    public String showSign(Model model) {
        model.addAttribute("speed", 70);
        return "sign";
    }
}
