package com.tgt.bean;
import com.tgt.dao.*;

import java.util.List;

public class EmployeeBean {

	private String EmpId="";
	private String EmpName="";
	public String getEmpId() {
		return EmpId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public EmployeeBean(String EmpId, String EmpName){
		this.EmpId = EmpId;
		this.EmpName = EmpName;
	}
}
