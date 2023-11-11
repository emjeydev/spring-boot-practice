package dev.emjey.challengefour.repository;

import dev.emjey.challengefour.Item;

import java.util.ArrayList;
import java.util.List;

// This file is made by EmJey
// Project: Globalstore.java - challenge 4
// FileName: StoreRepository.java
// Date: 2023/11/11
// Modified Date: 2023/11/11
// Email: emjeydev@gmail.com
// Github: emjeydev


public class StoreRepository {

    List<Item> items = new ArrayList<>();

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
