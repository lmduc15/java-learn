package com.karaoke.model;

public class MenuItemDTO {
    private String itemCode;
    private String itemName;
    private Long price;
    private String category;
    private String description;
    private Boolean available;
    private Integer quantity;


    public MenuItemDTO(String itemCode, String itemName, Long price, String category, String description, Boolean available, Integer quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.description = description;
        this.available = available;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
