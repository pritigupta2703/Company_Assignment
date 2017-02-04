package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.lang.Exception;
import java.util.List;

import com.shopping.dao.ProductDao;
import com.shopping.dao.ProductDaoImplement;
import com.shopping.domain.Product;

/**
 * Created by pritigupta on 2/2/17.
 */
public class ProductServiceImpl implements ProductService{
    static ProductDao productDao;
    static {
        try {
            productDao = new ProductDaoImplement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
       return productDao.getAllProducts();
    }

    @Override
    public void createProduct(File file1) throws SQLException, IOException {
        productDao.createProduct(file1);
    }

    @Override
    public void updateProduct(int id) throws SQLException {
        productDao.updateProduct(6);
    }

    @Override
    public void deleteProduct(int id) throws SQLException {
        productDao.deleteProduct(19);
    }

    @Override
    public void userbyid(int id) throws SQLException {
        productDao.productbyid(22);

    }


}
