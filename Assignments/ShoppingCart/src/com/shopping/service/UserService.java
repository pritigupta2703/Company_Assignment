package com.shopping.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.shopping.domain.User;

/**
 * Created by pritigupta on 2/2/17.
 */
public interface UserService {

//    public List<User> getallusers();
    public void createUser(File file) throws SQLException, IOException;
    public void updateUser(int id ) throws SQLException;
   public void deleteUser(int id)throws SQLException;
    public void userdisplayid(int id)throws SQLException;
    public List<User> getAllUsers() throws SQLException;



}
