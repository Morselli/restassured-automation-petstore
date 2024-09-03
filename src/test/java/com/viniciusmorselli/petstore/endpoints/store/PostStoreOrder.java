package com.viniciusmorselli.petstore.endpoints.store;

public class PostStoreOrder {
    int id;
    int petId;
    int quantity;
    String shipDate;
    String status;
    boolean complete;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getPetId() {
        return petId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public boolean getComplete() {
        return complete;
    }
}
