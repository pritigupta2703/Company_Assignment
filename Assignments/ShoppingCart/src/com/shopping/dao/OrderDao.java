package com.shopping.dao;
import java.io.IOException;
import java.io.*;
import java.sql.*;
import java.text.*;

/**
 * Created by pritigupta on 2/2/17.
 */
public interface OrderDao {
    public void ordercreate(File f1) throws  IOException, SQLException, ParseException;
    public void deleteOrder(int id)throws SQLException;
    public void updateOrder(int id) throws SQLException;

}
