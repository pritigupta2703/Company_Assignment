package com.shopping.dao;
import java.io.*;
import java.sql.SQLException;

/**
 * Created by pritigupta on 2/2/17.
 */
public interface OrderDetailDao {

    public void createOrderDEtail (File orderdetail ) throws FileNotFoundException , IOException,SQLException;
    public void deleteOrderDetail (int id) throws SQLException;
    public void updateOrderDetail (int id) throws SQLException;

}
