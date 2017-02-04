package com.shopping.dao;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shopping.utils.*;
import com.shopping.domain.*;
import com.shopping.utils.DBConnection;
/**
 * Created by pritigupta on 2/2/17.
 */
public class UserDaoImplement implements UserDao
{
    public Connection con;
    public Statement stm;
    public String sql1;

    public UserDaoImplement() throws SQLException {
        con = DBConnection.getConnection();
        stm = con.createStatement();
    }


    //@Override
    // public List<User> getallusers() {

    //}

    @Override
    public void createUser(File file) throws FileNotFoundException, IOException, SQLException


    {



        sql1 = "INSERT INTO user(user_name, first_name, last_name,address) values (?, ?, ?, ?); ";

        File f = file;
        FileReader fr = new FileReader(f);
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

            PreparedStatement pr = con.prepareStatement(sql1);
            pr.setString(1, s2[0]);
            pr.setString(2, s2[1]);
            pr.setString(3, s2[2]);
            pr.setString(4, s2[3]);
            pr.executeUpdate();
            System.out.println("added");

        }






    }
//
@Override
public void deleteUser(int id) throws SQLException {
    String sql4 = "delete from user where id = ?";
    PreparedStatement ps = con.prepareStatement(sql4);
    ps.setInt(1, 9);
    ps.executeUpdate();

    System.out.println();
    System.out.println("Deletion of " +id);
    System.out.println();
    ps.close();




   }

    @Override
    public void userdisplayid(int id) throws SQLException {
        Statement stmt = null;
        String sql6 = "select * from user where id ="+id;
        stmt = con.createStatement();
        ResultSet res1 = stmt.executeQuery(sql6);
        while (res1.next()) {

            int id1 = res1.getInt(1);
            String un = res1.getString(2);
            String fn = res1.getString(3);
            String ln = res1.getString(4);
            String add = res1.getString(5);

            System.out.println("User Id: " + id1 + "\tUser Name: " + un + "\tFirst Name: fn" + fn + "\tLast Name: " + ln + "\tAddress: " + add);
        }
            res1.close();
            stmt.close();









    }

    @Override
    public List<User> getAllUsers() throws SQLException {

        Connection cons = DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet res = null;
        List<User> userList = new ArrayList<>();
        ps= cons.prepareStatement("Select * from user");
        res=ps.executeQuery();
        while (res.next())
        {
            User user = new User();
            int id = res.getInt("id");
            String userName = res.getString("user_name");
            String firstName = res.getString("first_name");
            String lastName = res.getString("last_name");
            String address = res.getString("address");
            user.setId(id);
            user.setUsername1(userName);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setAddress(address);
            userList.add(user);
        }
        for (User u1:userList
                ) {
            System.out.println(u1.getId() + "," +u1.getUsername1()+ "," +u1.getFirstName()+ "," +u1.getLastName()+ "," +u1.getAddress());
        }
        cons.close();
        return userList;



    }

    @Override
    public void updateUser(int id )throws SQLException {

    String sql2 = "update user set user_name=?, first_name=?, last_name=?, address=? where id = ?";
    PreparedStatement ps = con.prepareStatement(sql2);
    ps.setString(1,"user104");
    ps.setString(2,"bhavya");
    ps.setString(3,"verma");
    ps.setString(4,"nabha");
    ps.setInt(5,2);
    ps.executeUpdate();

    System.out.println("Updation of " +id);
    System.out.println();
    ps.close();




}

        }


