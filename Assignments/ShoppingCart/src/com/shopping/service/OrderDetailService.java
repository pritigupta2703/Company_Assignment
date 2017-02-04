package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.shopping.domain.OrderDetails;

/**
 * Created by pritigupta on 2/2/17.
 */
public interface OrderDetailService {
    public void createOrderDetail (File orderdetail) throws SQLException, IOException;
    public void deleteOrderDetail (int id ) throws SQLException;

    List<OrderDetails> getOrderdetais(int i);
}
