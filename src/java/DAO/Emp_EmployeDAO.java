/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import ModelEmployee.Emp_NhanVien;
import java.util.Date;
/**
 *
 * @author PC
 */
public class Emp_EmployeDAO {
        public ArrayList<Emp_NhanVien> getAllEmploye(){
        ArrayList<Emp_NhanVien> list = new ArrayList<Emp_NhanVien>();
        String sql ="select * from employee";
        try {
            DBConnect db = new DBConnect();
            PreparedStatement st = db.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()){
                Emp_NhanVien nv = new Emp_NhanVien();
                
                nv.setEmployeeID(rs.getInt("EmployeeID"));
                nv.setName(rs.getString("Name"));
                nv.setGender(rs.getString("Gender"));
                nv.setPosition(rs.getString("Position"));
                nv.setDepartment(rs.getString("Department"));
                nv.setHireDate(rs.getDate("HireDate"));
                nv.setEmail(rs.getString("Email"));
                nv.setPhone(rs.getInt("Phone"));
                
                list.add(nv);
            }
            
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return list;
    }
    
    public void delete(int id){
        String sql = "delete from employee where EmployeeID=?";
        try {
            DBConnect db = new DBConnect();
            PreparedStatement st = db.getConnection().prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    public Emp_NhanVien getNhanVienID(int id){
        String sql ="select * from employee where EmployeeID=?";
        try {
            DBConnect db = new DBConnect();
            PreparedStatement st = db.getConnection().prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()){
                Emp_NhanVien nv = new Emp_NhanVien();
                
                nv.setEmployeeID(rs.getInt("EmployeeID"));
                nv.setName(rs.getString("Name"));
                nv.setGender(rs.getString("Gender"));
                nv.setPosition(rs.getString("Position"));
                nv.setDepartment(rs.getString("Department"));
                nv.setHireDate(rs.getDate("HireDate"));
                nv.setEmail(rs.getString("Email"));
                nv.setPhone(rs.getInt("Phone"));
                return nv;
            }
            
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return null;
    }
        public void them(Emp_NhanVien nv){
        String sql = "insert into employee values(?,?,?,?,?,?,?,?)";
        try {
            DBConnect db = new DBConnect();
            PreparedStatement st = db.getConnection().prepareStatement(sql);
            st.setInt(1, nv.getEmployeeID());
            st.setString(2, nv.getName());
            st.setString(3, nv.getGender());
            st.setString(4, nv.getPosition());
            st.setString(5, nv.getDepartment());
            st.setDate(6, (java.sql.Date) nv.getHireDate());
            st.setString(7, nv.getEmail());
            st.setInt(8, nv.getPhone());
            
     
            st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    public  void sua(Emp_NhanVien nv){
        String sql = "update employee set Name=?, Gender=?,Position=?,Department=?,HireDate=?,	Email=?,Phone=? where EmployeeID=?";
        try {
            DBConnect db = new DBConnect();
            PreparedStatement st = db.getConnection().prepareStatement(sql);
            st.setString(1, nv.getName());
            st.setString(2, nv.getGender());
            st.setString(3,nv.getPosition());
            st.setString(4, nv.getDepartment());
            st.setDate(5, (java.sql.Date) nv.getHireDate());
            st.setString(6, nv.getEmail());
            st.setInt(7, nv.getPhone());
            st.setInt(8, nv.getEmployeeID());
            st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
