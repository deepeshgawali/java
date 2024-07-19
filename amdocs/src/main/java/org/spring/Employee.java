package org.spring;



import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private String name;
    private int id;

    @Autowired
    private Department department; // Autowiring Department

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", department=" + department + "]";
    }
}
