package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import com.shopping.dao.OrderDao;
import com.shopping.dao.OrderDetailDao;
import com.shopping.dao.OrderDetailImplement;

/**
 * Created by pritigupta on 2/2/17.
 */
public class OrderDetailServiceImpl implements OrderDetailService{

 static OrderDetailDao orderDetailDao;
static {
    try {
        orderDetailDao = new OrderDetailImplement();
    } catch (SQLException e) {
        e.printStackTrace();
    }

}



    @Override
    public void createOrderDetail(File orderdetail) throws SQLException, IOException {
      orderDetailDao.createOrderDEtail(orderdetail);
    }

    @Override
    public void deleteOrderDetail(int id) throws SQLException {
        orderDetailDao.deleteOrderDetail(id);
    }
}
