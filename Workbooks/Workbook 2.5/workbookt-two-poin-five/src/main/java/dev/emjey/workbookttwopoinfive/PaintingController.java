package dev.emjey.workbookttwopoinfive;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaintingController {
    @GetMapping("/painting")
    public String getPainting(Model model) {
        model.addAttribute("painting", "starry-night");
        return "painting";
    }
}
