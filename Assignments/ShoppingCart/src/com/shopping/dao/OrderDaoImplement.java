package com.shopping.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.shopping.utils.DBConnection;

/**
 * Created by pritigupta on 2/2/17.
 */
public class OrderDaoImplement implements OrderDao {

    Connection conx ;
    public Statement stmx;
    public String sqlx;

    public OrderDaoImplement() throws SQLException
    {
        conx = DBConnection.getConnection();
        stmx = conx.createStatement();


    }
    @Override
    public void ordercreate(File f1) throws IOException, SQLException, ParseException {

        sqlx = "INSERT INTO orders (order_date , amount , user_id) values (?, ?, ?) ";

        File f = f1;
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String u;
        int i = 0;
        String[] str = new String[3];

        while ((u = br.readLine()) != null) {
            str[i] = u;
            i++;
        }

        for (String s : str)
        {
            String[] s2 = s.split(",");


            PreparedStatement ps = conx.prepareStatement(sqlx);

            ps.setString(1, s2[0]);
            ps.setString(2, s2[1]);
            ps.setString(3, s2[2]);
            ps.executeUpdate();

            ps.close();
        }


            System.out.println(" order added");

        }


    @Override
    public void deleteOrder(int id) throws SQLException {
        String sql6 = "delete from orders where id = ?";
        PreparedStatement ps = conx.prepareStatement(sql6);
        ps.setInt(1, 19);
        ps.executeUpdate();

        System.out.println();
        System.out.println("Deletion of " +id);
        System.out.println();
        ps.close();
    }

    @Override
    public void updateOrder(int id) throws SQLException {
        String updateqry = "update orders set order_date=?, amount=?, user_id=? where id = ?";

        PreparedStatement ps = conx.prepareStatement(updateqry);
        ps.setString(1, "2017-02-03");
        ps.setDouble(2, 100.00);
        ps.setInt(3, 10);
        ps.setInt(4, 5);
        ps.executeUpdate();

        System.out.println("Updated order " + id + " successfull");
        System.out.println();
        ps.close();

    }
}



