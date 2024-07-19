package com.spring;

public class Department {
private String depname;

public Department() {
	super();
	// TODO Auto-generated constructor stub
}

public Department(String depname) {
	super();
	this.depname = depname;
}

public String getDepname() {
	//System.out.print(depname);
	return depname;
}

public void setDepname(String depname) {
	this.depname = depname;
}

@Override
public String toString() {
	return "Department [depname=" + depname + "]";
}

}
