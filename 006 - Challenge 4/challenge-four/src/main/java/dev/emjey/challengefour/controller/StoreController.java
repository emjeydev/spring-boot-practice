package dev.emjey.challengefour.controller;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import dev.emjey.challengefour.Constants;
import dev.emjey.challengefour.Item;
import dev.emjey.challengefour.repository.StoreRepository;
import dev.emjey.challengefour.service.StoreService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// This file is made by EmJey
// Project: Globalstore.java - challenge 4
// FileName: StoreController.java
// Date: 2023/11/11
// Modified Date: 2023/11/11
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class StoreController {

    StoreService storeService = new StoreService();

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("item", storeService.getItemById(id));
        return "form";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(@Valid Item item, BindingResult result, RedirectAttributes redirectAttributes) {
        if (item.getPrice() < item.getDiscount()) {
            result.rejectValue("price", "", "Price cannot be less than discount");
        }
        if (result.hasErrors()) return "form";

        String status = storeService.submitItem(item);
        redirectAttributes.addFlashAttribute("status", status);
        return "redirect:/inventory";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("items", storeService.getItems());
        return "inventory";
    }


}
