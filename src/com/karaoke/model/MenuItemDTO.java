package com.karaoke.model;

public class MenuItemDTO {
    private String itemCode;
    private String itemName;
    private Long price;
    private String category;

    public MenuItemDTO(String itemCode, String itemName, Long price, String category) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
