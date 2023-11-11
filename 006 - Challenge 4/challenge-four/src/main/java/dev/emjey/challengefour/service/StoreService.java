package dev.emjey.challengefour.service;

// This file is made by EmJey
// Project: Globalstore.java - challenge 4
// FileName: StoreService.java
// Date: 2023/11/11
// Modified Date: 2023/11/11
// Email: emjeydev@gmail.com
// Github: emjeydev

import dev.emjey.challengefour.Constants;
import dev.emjey.challengefour.Item;
import dev.emjey.challengefour.repository.StoreRepository;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StoreService {
    StoreRepository storeRepository = new StoreRepository();

    public Item getItem(int index) {
        return storeRepository.getItem(index);
    }

    public void addItem(Item item) {
        storeRepository.addItem(item);
    }

    public void updateItem(Item item, int index) {
        storeRepository.updateItem(item, index);
    }

    public List<Item> getItems() {
        return storeRepository.getItems();
    }

    public int getIndexFromId(String id) {
        for (int i = 0; i < getItems().size(); i++) {
            if (getItems().get(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }

    public boolean within5Days(Date newDate, Date oldDate) {
        long diff = Math.abs(newDate.getTime() - oldDate.getTime());
        return (int) (TimeUnit.MILLISECONDS.toDays(diff)) <= 5;
    }

    public Item getItemById(String id) {
        int index = getIndexFromId(id);
        return index == Constants.NOT_FOUND ? new Item() : getItem(index);
    }

    public String submitItem(Item item) {
        int index = getIndexFromId(item.getId());

        String status = Constants.SUCCESS_STATUS;
        if (index == Constants.NOT_FOUND) {
            addItem(item);
        } else if (within5Days(item.getDate(), getItem(index).getDate())) {
            updateItem(item, index);
        } else {
            status = Constants.FAILED_STATUS;
        }

        return status;
    }
}
