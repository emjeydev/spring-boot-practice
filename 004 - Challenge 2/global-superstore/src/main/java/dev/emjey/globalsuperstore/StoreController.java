package dev.emjey.globalsuperstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

// This file is made by EmJey
// Project: GlobalSuperstore.java
// FileName: StoreController.java
// Date: 2023/10/07
// Modified Date: 2023/10/07
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class StoreController {

    private List<Item> itemList = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {

        int index = getIndexById(id);

        model.addAttribute("item", index == Constants.NOT_FOUND ? new Item() : itemList.get(index));

        model.addAttribute("categories", Constants.CATEGORIES);

        return "form";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("items", itemList);
        return "inventory";
    }

    @PostMapping("/submitItem")
    public String submitForm(Item item, RedirectAttributes redirectAttributes) {
        int index = getIndexById(item.getId());
        if (index == Constants.NOT_FOUND) {
            itemList.add(item);
        } else {
            itemList.set(index, item);
        }
        redirectAttributes.addFlashAttribute("status", Constants.SUCCESS_STATUS);
        return "redirect:/inventory";
    }

    public int getIndexById(String id) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }

}
