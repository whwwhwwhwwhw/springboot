package com.springboot.jopo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Emp {
    @Id
    @GeneratedValue
    private Integer empid;
    private String empname;
    private Integer empdeptid;

    @Override
    public String toString() {
        return "jopo{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empdeptid=" + empdeptid +
                '}';
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getEmpdeptid() {
        return empdeptid;
    }

    public void setEmpdeptid(Integer empdeptid) {
        this.empdeptid = empdeptid;
    }
}
