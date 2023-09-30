package dev.emjey.workbooktwopointeight;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("")
    public String getLandingPage() {
        return "page";
    }
}
