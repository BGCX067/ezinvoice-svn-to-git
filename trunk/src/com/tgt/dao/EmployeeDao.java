package com.tgt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.tgt.bean.EmployeeBean;

public class EmployeeDao {
	List list1=null;
	Connection con = null;
	PreparedStatement pst=null;
	ResultSet result=null;
	public List getSearch(EmployeeBean bean){
		String sql="select * from employee where emp_Id=? and fname=?";
		try{
			con = getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, bean.getEmpId());
			pst.setString(2, bean.getEmpName());
			result = pst.executeQuery();
			while(result.next()){
				HashMap map=new HashMap(); 
				map.put(1, result.getString(1));
				
				list1.add(map);
			}
			return list1;
		} catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	public Connection getConnection(){
		String driver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		String url = "jdbc:microsoft:sqlserver://localhost:1433;DataBaseName=pubs;SelectMethod=cursor";
		String username = "sa";
		String password = "admin";
		Connection connection = null;
		try{
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		} catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return connection;
	}
}
