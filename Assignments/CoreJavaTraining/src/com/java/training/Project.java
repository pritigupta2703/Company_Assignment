package com.java.training;

import java.util.List;

/**
 * Created by pritigupta on 1/25/17.
 */
public class Project {
    int id ;

    List<Employee> employeeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmp (Employee e )
    {
        this.employeeList.add(e);
    }

    public static Project createProject( int id ){
        Project p1 = new Project();
        p1.setId(id);
        return p1;
    }

}
