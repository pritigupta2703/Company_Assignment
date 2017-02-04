package com.shopping.dao;
import com.shopping.*;
import com.shopping.domain.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by pritigupta on 2/2/17.
 */
public interface UserDao  {

//    public List <User> getallusers();
    public void createUser(File file) throws FileNotFoundException,IOException,SQLException;
   public void updateUser(int id)throws SQLException;
public void deleteUser(int id)throws SQLException;
public void userdisplayid(int id) throws SQLException;
    public List<User> getAllUsers() throws SQLException;

}
