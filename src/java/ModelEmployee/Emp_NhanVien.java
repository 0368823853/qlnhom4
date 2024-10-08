/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelEmployee;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Emp_NhanVien {
    public String name, gender,position,department,email;
    public Date hireDate;
    public int phone,employeeID;

    public Emp_NhanVien(int employeeID, String name, String gender, String position, String department, Date hireDate, String email, int phone) {
        this.employeeID = employeeID;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.department = department;
        this.hireDate = hireDate;
        this.email = email;
        this.phone = phone;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Emp_NhanVien() {
    }
}
