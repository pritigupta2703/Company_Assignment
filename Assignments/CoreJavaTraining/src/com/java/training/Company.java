package com.java.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pritigupta on 1/25/17.
 */
public class Company {
    private int id ;
    private String name;
    List<Dept> deptList;
    public Company(){
        deptList = new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dept> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<Dept> deptList) {
        this.deptList = deptList;
    }



     public  void addDept (Dept dept)
     {
         this.deptList.add(dept);
     }


   public static  Company createCompany( int id , String name )
   {
       Company c1 = new Company();
       c1.setId(id);
       c1.setName(name);
       return c1;
   }
}
