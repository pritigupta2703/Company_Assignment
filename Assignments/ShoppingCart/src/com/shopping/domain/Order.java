package com.shopping.domain;

import java.util.Date;
import java.util.List;

import com.shopping.utils.DBConnection;


/**
 * Created by pritigupta on 1/25/17.
 */
public class Order {
    private  int id;
    private Date orderDate;
    private double amount;
    private int userId;
    private List<OrderDetails> orderDetailsList;

    public static void main(String[] args) {
        DBConnection.getConnection();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    public void setUserId(int userId) {
        this.userId = userId;

    }


}
