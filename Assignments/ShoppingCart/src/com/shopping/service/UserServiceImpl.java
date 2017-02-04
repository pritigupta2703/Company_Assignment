package com.shopping.service;

import java.sql.SQLException;
import java.util.List;
import java.io.*;

import com.shopping.dao.UserDao;
import com.shopping.dao.UserDaoImplement;
import com.shopping.domain.User;

/**
 * Created by pritigupta on 2/2/17.
 */
public class UserServiceImpl implements UserService {

    static UserDao userDao;



    static {
        try {
            userDao = new UserDaoImplement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





    @Override
    public void createUser(File file) throws SQLException, IOException {
        userDao.createUser(file);
    }

    @Override
    public void userdisplayid(int id)throws SQLException {
        userDao.userdisplayid(id);

    }


    @Override
 public void updateUser(int id  )throws SQLException {

        userDao.updateUser(id);
   }
//
    @Override
    public void deleteUser(int id) throws SQLException {
        userDao.deleteUser(id);


    }

    @Override
    public List<User> getAllUsers() throws SQLException {
       return userDao.getAllUsers();
    }



}
