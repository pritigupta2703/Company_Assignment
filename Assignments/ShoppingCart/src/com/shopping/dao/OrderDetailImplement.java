package com.shopping.dao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.shopping.domain.OrderDetails;
import com.shopping.utils.DBConnection;

/**
 * Created by pritigupta on 2/2/17.
 */
public class OrderDetailImplement implements OrderDetailDao {
    Connection coni;
    Statement stmt1;
    String sqla;

    public OrderDetailImplement() throws SQLException {
        coni = DBConnection.getConnection();
        stmt1 = coni.createStatement();
    }


    @Override
    public void createOrderDEtail(File orderdetail) throws FileNotFoundException, IOException, SQLException {
        sqla = "INSERT INTO order_detail(order_id,product_id,quantity,price) values (?, ?, ?, ?); ";
        File fo = orderdetail;
        FileReader fr = new FileReader(fo);
        BufferedReader br = new BufferedReader(fr);

        String u;
        int i = 0;
        String[] str = new String[3];

        while ((u = br.readLine()) != null) {
            str[i] = u;
            i++;
        }

        for (String s : str) {
            String[] s2 = s.split(",");

            PreparedStatement pr = coni.prepareStatement(sqla);
            pr.setInt(1, Integer.parseInt(s2[0]));
            pr.setInt(2, Integer.parseInt(s2[1]));
            pr.setInt(3, Integer.parseInt(s2[2]));
            pr.setInt(4, Integer.parseInt(s2[3]));
            pr.executeUpdate();
            System.out.println("added");


        }


    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void deleteOrderDetail(int id) throws SQLException {

        String sql5 = " delete from order_detail where id = ?";
        PreparedStatement ps = coni.prepareStatement(sql5);
        ps.setInt(1, 19);
        ps.executeUpdate();

        System.out.println();
        System.out.println("Deletion of " +id);
        System.out.println();

    }

    @Override
    public void updateOrderDetail(int id) throws SQLException {

    }
}
