package com.tgt.emp;
import java.util.List;

import org.apache.struts.action.ActionForm;
/**
 * @author Tushar.Kapoor
 * Form bean to handle the Employee data.
 */
public class EmployeeForm extends ActionForm{
	
	private String empId="";
	private String fname="";
	private String minit="";
	private String lname="";
	private String jobid="";
	private String joblvl="";
	private String pubid="";
	private String hiredate="";
	private List list=null;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public String getJoblvl() {
		return joblvl;
	}
	public void setJoblvl(String joblvl) {
		this.joblvl = joblvl;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMinit() {
		return minit;
	}
	public void setMinit(String minit) {
		this.minit = minit;
	}
	public String getPubid() {
		return pubid;
	}
	public void setPubid(String pubid) {
		this.pubid = pubid;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
}