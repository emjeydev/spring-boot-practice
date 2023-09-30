package dev.emjey.workbooktwopointeleven;

// This file is made by EmJey
// Project: Workbook 2.11
// FileName: Record.java
// Date: 2023/09/30
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.math.BigDecimal;

public class Record {

    private String item;
    private BigDecimal revenue;
    private BigDecimal cost;

    public Record(String item, BigDecimal revenue, BigDecimal cost) {
        this.item = item;
        this.revenue = revenue;
        this.cost = cost;
    }


    // Getters and Setters
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
