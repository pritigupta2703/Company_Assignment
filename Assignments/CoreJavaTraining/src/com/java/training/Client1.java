package com.java.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pritigupta on 2/1/17.
 */
public class Client1 {
    public static void main(String[] args) {
        Company c1 = Company.createCompany(1,"AppDirect");
        List<Dept> deptList = new ArrayList<>();


        List<Project> projectList = new ArrayList<>();


        List<Employee> employeeList = new ArrayList<>();

        Dept de1 = Dept.createDept(11,"HR");

        // Project one
        Project pr1 = Project.createProject(12);
        // Employees under First Project
        Employee em1 =  new Employee(1, "Priti", 12);
        Employee em2 = new Employee(2,"Sapna",14);

        pr1.setEmployeeList(employeeList);
        pr1.addEmp(em1);
        pr1.addEmp(em2);

        // Project Second
        Project pr2 = Project.createProject(13);

        //Employee under Second Project
        Employee em3 = new Employee(3,"Ria",15);
        Employee em4 = new Employee(4,"Bhavya",16);

        pr2.setEmployeeList(employeeList);
        pr2.addEmp(em3);
        pr2.addEmp(em4);

        de1.setProjectsList(projectList);
        de1.addPro(pr1);
        de1.addPro(pr2);

        Dept de2 = Dept.createDept(12,"Software");

        //project third
        Project pr3 = Project.createProject(14);
        //employee under project third
        Employee em5 = new Employee(5,"akash",17);
        Employee em6 = new Employee(6,"anchal",18);

        pr3.setEmployeeList(employeeList);
        pr3.addEmp(em5);
        pr3.addEmp(em6);

        //Project fourth
        Project pr4 = Project.createProject(15);
        //Employee under project fourth
        Employee em7 = new Employee(7,"bilal",19);
        Employee em8 = new Employee(8,"naina",20);
        pr4.setEmployeeList(employeeList);
        pr4.addEmp(em7);
        pr4.addEmp(em8);

        de2.setProjectsList(projectList);
        de2.addPro(pr3);
        de2.addPro(pr4);

        c1.setDeptList(deptList);
        c1.addDept(de1);
        c1.addDept(de2);


        Company c2 = Company.createCompany(2,"flipkart");
         List<Dept> deptList1 = new ArrayList<>();
         List<Project> projectList1 = new ArrayList<>();

         Dept de3 = Dept.createDept(23,"admin");
         //Project 5
         Project pr5 = Project.createProject(16);
         //employees under project 5
        Employee em9 = new Employee(9,"abhi",21);
        Employee em10 = new Employee(10,"sana",22);
        pr5.setEmployeeList(employeeList);
        pr5.addEmp(em9);
        pr5.addEmp(em10);

        Project pr6 = Project.createProject(17);
        //employees under project 6
        Employee em11 = new Employee(11,"abhinav",23);
        Employee em12 = new Employee(12,"sanaya",24);
        pr6.setEmployeeList(employeeList);
        pr6.addEmp(em11);
        pr6.addEmp(em12);

        de3.setProjectsList(projectList1);
        de3.addPro(pr5);
        de3.addPro(pr6);

        Dept de4 = Dept.createDept(24,"administration");
        //Project 7
        Project pr7 = Project.createProject(18);
        //employees under project 7
        Employee em13 = new Employee(13,"abhinaya",25);
        Employee em14 = new Employee(14,"sanasheikh",26);
        pr7.setEmployeeList(employeeList);
        pr7.addEmp(em13);
        pr7.addEmp(em14);

        Project pr8 = Project.createProject(19);
        //employees under project 7
        Employee em15 = new Employee(15,"naya",27);
        Employee em16 = new Employee(16,"sheikh",28);
        pr8.setEmployeeList(employeeList);
        pr8.addEmp(em15);
        pr8.addEmp(em16);
          de4.setProjectsList(projectList1);
          de4.addPro(pr7);
          de4.addPro(pr8);

        c2.setDeptList(deptList1);
        c2.addDept(de3);
        c2.addDept(de4);


        List<Company> companyList = new ArrayList<>();
        companyList.add(c1);
        companyList.add(c2);




        for (Company company : companyList)
        {
            System.out.println("company id is " +company.getId());
            System.out.println("company name is "+company.getName());
            System.out.println();
            List<Dept> depts = company.getDeptList();

            for (int i = 0 ;i<depts.size();i++)
            {
                Dept dept = depts.get(i);

                System.out.println("\tdepartment id is "+dept.getId());
                System.out.println("\tdepartment name is " +dept.getName());
                List<Project> projects = dept.getProjectsList();

                int j=0;

                while (j <projects.size()) {
                    Project project = projects.get(j);
                    System.out.println("\t \tproject id under this department are " + project.getId());
                    j++;

                    List<Employee> employees = project.getEmployeeList();
                    Iterator<Employee> employeeIterator = employees.iterator();
                    while (employeeIterator.hasNext())
                    {
                        Employee eq = employeeIterator.next();
                        System.out.println("\t\t\tEmployee id under this project "+eq.getId());
                        System.out.println("\t\t\tEmployee name under this project "+eq.getName());
                        System.out.println("\t\t\tEmployee age under this project "+eq.getAge());

                    }

                }

            }

        }













    }


}
