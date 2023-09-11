package emjey.dev.workbooktwopointtwo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// This file is made by EmJey
// Project: Workbook 2.2
// FileName: ShowController
// Date: 2023/09/11
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class ShowController {

    @GetMapping("/show")
    public String getShowCase(Model model) {
        Show showCase1 = new Show("Breaking Bad", "Ozymandias", 10.0);
        Show showCase2 = new Show("Attack on Titan", "Hero", 9.9);
        Show showCase3 = new Show("Attack on Titan", "Perfect Game", 9.9);
        Show showCase4 = new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9);
        Show showCase5 = new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9);

        model.addAttribute("sc1",showCase1);
        model.addAttribute("sc2",showCase2);
        model.addAttribute("sc3",showCase3);
        model.addAttribute("sc4",showCase4);
        model.addAttribute("sc5",showCase5);
        return "showCase";
    }
}
