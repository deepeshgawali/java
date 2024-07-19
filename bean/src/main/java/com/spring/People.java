package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class People {
    private String name;
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "People [name=" + name + ", department=" + department + "]";
    }
}
