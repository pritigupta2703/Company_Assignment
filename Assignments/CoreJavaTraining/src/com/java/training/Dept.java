package com.java.training;

import java.util.List;

/**
 * Created by pritigupta on 1/25/17.
 */
public class Dept {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id ;
    private String name;

    public List<Project>projectsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Project> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<Project> projectsList) {
        this.projectsList = projectsList;
    }

    public  void addPro (Project p )
    {
        this.projectsList.add(p);
    }
    public static Dept createDept (int id , String name)
    {
        Dept d1 = new Dept();
        d1.setId(id);
        d1.setName(name);
        return d1;
    }


}
