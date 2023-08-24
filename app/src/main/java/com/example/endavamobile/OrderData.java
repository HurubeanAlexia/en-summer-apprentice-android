package com.example.endavamobile;

public class OrderData {

    private String festivalName;

    private String orderData;
    private String ticketNumber;
    private String ticketCategory;
    private String totalPrice;


    public OrderData(String festivalName, String orderData, String ticketNumber, String ticketCategory, String totalPrice) {
        this.festivalName = festivalName;
        this.orderData = orderData;
        this.ticketNumber = ticketNumber;
        this.ticketCategory = ticketCategory;
        this.totalPrice = totalPrice;
    }

    public void setFestivalName(String festivalName) {
        this.festivalName = festivalName;
    }

    public String getOrderData() {
        return orderData;
    }

    public void setOrderData(String orderData) {
        this.orderData = orderData;
    }

    public String getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(String ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public String getFestivalName() {
        return festivalName;
    }

    public void setName(String festivalName) {
        this.festivalName = festivalName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
