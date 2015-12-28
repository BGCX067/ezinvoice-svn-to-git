package com.tgt.emp;

import org.apache.struts.action.Action;
	import java.util.ArrayList;
	import java.util.List;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import org.apache.struts.action.Action;
	import org.apache.struts.action.ActionForm;
	import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.tgt.bean.EmployeeBean;
import com.tgt.dao.EmployeeDao;

	public class EmployeeAction extends Action{
		public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
			String target = "success";
			List list=null;
			EmployeeForm empForm = (EmployeeForm) form;
			String EmpId=empForm.getEmpId();
			String EmpName=empForm.getLname();
//			list.add(empForm.getEmpId());
//			list.add(empForm.getLname());
			EmployeeBean bean = new EmployeeBean(EmpId, EmpName);
			
			EmployeeDao dao = new EmployeeDao(); 
			List l = dao.getSearch(bean);
			// or
			// SampleForm sampleForm1 = (SampleForm)request.getAttribute("sampleForm");
			
			
			
			//
			//
			// List l = SearchBean.getData(name);
			//List l = new ArrayList();
			//l.add("rahul");
			//l.add("dheeraj");
			
			request.setAttribute("data", l);
			// or
		//	HttpSession session = request.getSession();
			//session.setAttribute("data", l);
			// or
			//sampleForm.setList(l);
			
			
			return mapping.findForward(target);
			// return mapping.findForward("success");
			// return mapping.findForward("failure");
			// return mapping.findForward("add");
		}
	}



