<%@ taglib uri="/tags/struts-logic" prefix="l" %>
<%@ taglib uri="/tags/struts-bean" prefix="b" %>
<%@ taglib uri="/tags/struts-html" prefix="h" %>
<html>
<body>
<h:form action="/ProcessEmployee">
	<b:message key="employeeForm.empId"/>
	<h:text property="empId" /><br/>
	<b:message key="employeeForm.fname"/>
	<h:text property="fname" /><br/>
	<h:submit>Submit</h:submit>
</h:form>
</body>
</html>
