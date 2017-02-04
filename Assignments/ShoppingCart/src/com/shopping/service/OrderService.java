package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

/**
 * Created by pritigupta on 2/2/17.
 */
public interface OrderService  {
    public void ordercreate(File f1) throws IOException, SQLException, ParseException;
    public void deleteOrder(int id ) throws SQLException;
    public void updateOrder (int id ) throws SQLException;
}
