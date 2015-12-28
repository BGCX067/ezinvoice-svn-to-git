<%@ taglib uri="/tags/struts-logic" prefix="l" %>
<%@ taglib uri="/tags/struts-bean" prefix="b" %>
<%@ taglib uri="/tags/struts-html" prefix="h" %>
<l:present name="data" scope="request">
	action was called.
	<l:iterate name="d" value="data">
		<b:write name="d" /><br>
	</l:iterate>
</l:present>
dsadas
<l:notPresent name="data" scope="request">
	action was not called.
</l:notPresent>"WebContent/ProcessEmployee.jsp"