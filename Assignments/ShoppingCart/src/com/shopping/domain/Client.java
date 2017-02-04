package com.shopping.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;

import com.shopping.dao.OrderDaoImplement;
import com.shopping.dao.ProductDao;
import com.shopping.dao.ProductDaoImplement;
import com.shopping.dao.UserDao;
import com.shopping.dao.UserDaoImplement;
import com.shopping.service.OrderDetailService;
import com.shopping.service.OrderDetailServiceImpl;
import com.shopping.service.OrderService;
import com.shopping.service.OrderServiceImpl;
import com.shopping.service.ProductService;
import com.shopping.service.ProductServiceImpl;
import com.shopping.service.UserService;
import com.shopping.service.UserServiceImpl;
import java.util.*;
import java.io.*;

/**
 * Created by pritigupta on 2/2/17.
 */
public class Client {

    static UserService userService;
    static UserDao userDao;
    static ProductService productService;
    static ProductDao productDao;
    static OrderDaoImplement orderDao;
    static OrderService orderService;
    static OrderDetailService orderDetailService;
    static {

        userService = new UserServiceImpl();
        productService = new ProductServiceImpl();
        orderService = new OrderServiceImpl();
        orderDetailService = new OrderDetailServiceImpl();



    }

    public static void main(String[] args) throws SQLException, IOException, ParseException {
        int ui1, ui2, ui3, ui4, ui5;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Client client = new Client();

        File f = new File("/Users/pritigupta/Java/Assignments/ShoppingCart/src/com/shopping/users");

        userService.createUser(f);

        userService.updateUser(2);

        System.out.println("enter the user to be deleted");
        ui2 = Integer.parseInt(br.readLine());
        userService.deleteUser(6);


        System.out.println("enter the userid to display its details");
        ui3 = Integer.parseInt(br.readLine());
        userService.userdisplayid(1);

        userService.getAllUsers();

        File f2 = new File("/Users/pritigupta/Java/Assignments/ShoppingCart/src/com/shopping/products");
        productService.createProduct(f2);
        productService.updateProduct(6);
        System.out.println("enter the product to be deleted");
        ui3 = Integer.parseInt(br.readLine());

        productService.deleteProduct(10);

        System.out.println("enter the product id to know the details ");
        ui4 = Integer.parseInt(br.readLine());
        productService.userbyid(1);


        productService.getAllProducts();


        File f1 = new File("/Users/pritigupta/Java/Assignments/ShoppingCart/src/com/shopping/order");

        orderService.ordercreate(f1);

        System.out.println("enter the order id to be deleted");
        ui1 = Integer.parseInt(br.readLine());
        orderService.deleteOrder(ui1);

        System.out.println("enter the id to be updated");
        ui5 = Integer.parseInt(br.readLine());
        orderService.updateOrder(ui5);


        File orderdetail = new File("/Users/pritigupta/Java/Assignments/ShoppingCart/src/com/shopping/orderdetail");

        orderDetailService.createOrderDetail(orderdetail);
        orderDetailService.deleteOrderDetail(10);


        List<OrderDetails> orderDetails = new ArrayList<>();
        orderDetails = orderDetailService.getOrderdetais(1);
        File fp = new File("/Users/pritigupta/Java/Assignments/ShoppingCart/src/com/shopping/order.csv");

        String s = ",";
        String nl = "\n";
        String fh = "Order_Id ,Product_Id ,Quantity ,Price ,Amount ";
        FileWriter fw = null;
        try {
            try {
                f1.createNewFile();
                fw = new FileWriter(fp);
                fw.append(fh.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            double Total = 0;
            for (OrderDetails od : orderDetails) {
                double s1 = 0;
                try {
                    fw.append(nl);
                    fw.append(Integer.toString(od.getOrderId()));
                    fw.append(s);
                    fw.append(Integer.toString(od.getId()));
                    fw.append(s);
                    fw.append(Integer.toString(od.getProductId()));
                    fw.append(s);
                    fw.append(Integer.toString(od.getQuantity()));
                    fw.append(s);
                    fw.append(Double.toString(od.getPrice()));
                    fw.append(s);
                    Double x = od.getPrice();
                    int q = od.getQuantity();
                    s1 = s1 + (q * x);
                    fw.append(Double.toString(s1));
                    fw.flush();
                    System.out.print(od.getAmount());
                    System.out.print(od.getId());
                    System.out.print(od.getPrice());
                    System.out.print(od.getQuantity());
                    System.out.print(od.getProductId());
                    System.out.print(od.getOrderId());
                    System.out.println(" ");
                    Total = Total + s1;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                fw.append(nl);
                fw.append(s);
                fw.append(s);
                fw.append(s);
                fw.append(s);
                fw.append("Amount=");
                fw.append(s);
                fw.append(Double.toString(Total));
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("done");
            }

        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }



}
