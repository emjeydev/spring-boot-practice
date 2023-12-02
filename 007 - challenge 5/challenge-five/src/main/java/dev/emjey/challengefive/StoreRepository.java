package dev.emjey.challengefive;

import java.util.ArrayList;
import java.util.List;

// This file is made by EmJey
// Project: challenge 5
// FileName: StoreRepository.java
// Date: 2023/12/02
// Modified Date: 2023/12/02
// Email: emjeydev@gmail.com
// Github: emjeydev

public class StoreRepository {
    
    private List<Item> items = new ArrayList<>();

    public Item getItem(int index) {
        return items.get(index);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void updateItem(Item item, int index) {
        items.set(index, item);
    }
    
    public List<Item> getItems() {
        return items;
    }


}
