package com.shopping.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shopping.domain.Product;
import com.shopping.utils.DBConnection;

/**
 * Created by pritigupta on 2/2/17.
 */
public class ProductDaoImplement implements ProductDao{

    Connection con1;
    Statement stm1;
    String sql2;
    public ProductDaoImplement() throws SQLException {
        con1 = DBConnection.getConnection();
        stm1 = con1.createStatement();
    }
    @Override
    public List<Product> getAllProducts() throws SQLException {
        Connection cons1 = DBConnection.getConnection();
        PreparedStatement psm = null;
        ResultSet rs1 = null ;
        List<Product> productList = new ArrayList<>();
        psm= cons1.prepareStatement("Select * from product_detail");
        rs1=psm.executeQuery();
        while (rs1.next()){
            Product product = new Product();
            int id = rs1.getInt("id");
            String proname = rs1.getString("p_name");
            String procode = rs1.getString("p_code");
            Double proPrice= rs1.getDouble("p_price");
            int stock1 = rs1.getInt("stock");
            product.setId(id);
            product.setName(proname);
            product.setCode(procode);
            product.setPrice(proPrice);
            product.setStock(stock1);
            productList.add(product);
        }
     for(Product p1:productList)
    {
    System.out.println(p1.getId()+ ","+p1.getName()+","+p1.getCode()+","+p1.getPrice()+","+p1.getStock());
    }

        cons1.close();
        return productList;
        }





    @Override
    public List<Product> getallProducts() {
        return null;
    }

    @Override
    public void createProduct(File file1) throws SQLException,FileNotFoundException ,IOException {


        sql2 = "INSERT INTO product_detail(p_name, p_code,p_price,stock) values (?, ?, ?, ?); ";
        File f1 = file1;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String u;
        int i = 0;
        String[] str = new String[3];

        while ((u = br.readLine()) != null) {
            str[i] = u;
            i++;
        }

        for (String s : str
                ) {
            String[] s2 = s.split(",");

            PreparedStatement pr = con1.prepareStatement(sql2);
            pr.setString(1, s2[0]);
            pr.setString(2, s2[1]);
            pr.setString(3, s2[2]);
            pr.setString(4, s2[3]);
            pr.executeUpdate();
            System.out.println("added");

        }


        }

    @Override
    public void updateProduct(int id) throws SQLException {
        String sql3 = "update product_detail set p_name=?, p_code=?, p_price=?, stock=? where id = ?";
        PreparedStatement p = con1.prepareStatement(sql3);
        p.setString(1,"notebook");
        p.setString(2,"n123");
        p.setString(3,"100");
        p.setString(4,"90");
        p.setInt(5,6);
        p.executeUpdate();

        System.out.println("Updation of " +id);
        System.out.println();
        p.close();

    }

    @Override
    public void deleteProduct(int id) throws SQLException {
        String sql5 = "delete from product_detail where id = ?";
        PreparedStatement ps = con1.prepareStatement(sql5);
        ps.setInt(1, 19);
        ps.executeUpdate();

        System.out.println();
        System.out.println("Deletion of " +id);
        System.out.println();
        ps.close();




    }

    @Override
    public void productbyid(int id) throws SQLException {
        Statement stmt1 = null;
        String sql7 = "select * from product_detail where id ="+id;
        stmt1 = con1.createStatement();
        ResultSet res2 = stmt1.executeQuery(sql7);
        while (res2.next()) {

            int id1 = res2.getInt(1);
            String pn = res2.getString(2);
            String pc = res2.getString(3);
            Double pr = res2.getDouble(4);
            int st = res2.getInt(5);


            System.out.println("User Id: " + id1 + "\tProduct Name: " + pn + "\tProduct Code: fn" + pc + "\t Procduct Price " + pr + "\tStock: " + st);
        }
        res2.close();
        stmt1.close();
    }





    }

