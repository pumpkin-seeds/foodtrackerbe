package com.foodtrackerbe.foodtrackerbe;

import java.time.LocalDate;

public class UserInfo {
    private int recordId, foodId, quantity;
    private String userId;
    private LocalDate recordDate;

    public UserInfo() {

    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public int getRecordId() {
        return recordId;
    }

    public int getFoodId() {
        return foodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUserId() {
        return userId;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

}
