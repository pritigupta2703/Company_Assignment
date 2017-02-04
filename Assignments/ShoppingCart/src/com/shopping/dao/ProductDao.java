package com.shopping.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.shopping.domain.Product;

/**
 * Created by pritigupta on 2/2/17.
 */
public interface ProductDao {
    public List<Product> getallProducts ();
    public void createProduct(File file1) throws SQLException,FileNotFoundException,IOException;
    public void updateProduct(int id)throws SQLException;
    public void deleteProduct(int id ) throws SQLException;
    public void productbyid(int id) throws SQLException;
    public  List <Product> getAllProducts() throws SQLException;




}
