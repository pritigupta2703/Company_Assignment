package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import com.shopping.dao.OrderDao;
import com.shopping.dao.OrderDaoImplement;

/**
 * Created by pritigupta on 2/2/17.
 */
public class OrderServiceImpl implements OrderService {
    static OrderDao orderDao;

    static {
        try {
            orderDao = new OrderDaoImplement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void ordercreate(File f1) throws IOException, SQLException, ParseException {
        OrderDao orderDao = new OrderDaoImplement();
        orderDao.ordercreate(f1);
    }
    @Override
    public void deleteOrder (int id ) throws SQLException
    {
        orderDao.deleteOrder(id);
    }

    @Override
    public void updateOrder(int id) throws SQLException {
        orderDao.updateOrder(id);
    }
}
