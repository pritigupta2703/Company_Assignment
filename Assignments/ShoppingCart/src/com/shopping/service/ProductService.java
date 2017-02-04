package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.shopping.domain.Product;

/**
 * Created by pritigupta on 2/2/17.
 */
public interface ProductService  {

    public void createProduct(File file1) throws SQLException, IOException;
    public void updateProduct (int id) throws SQLException;
    public void deleteProduct (int id) throws SQLException;
    public void userbyid(int id)throws SQLException;
    public List <Product> getAllProducts() throws SQLException;

}
