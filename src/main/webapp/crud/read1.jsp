<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
	<head>
		<style type="text/css">
			table {
				border: solid 1px #ddd;
				padding: 0px;
			}
			
			td {
				border-bottom: solid 1px #ddd;
				padding-left: 5px;
				padding-right: 10px;
			}
		</style>
	</head>
	<body>
	
	<span style="font-weight: bold; font-size: large; color: red;">R</span><span style="font-size: large;">ead</span><br/><br/>
	
	<table>
		<tr>
			<td>Name</td>
			<td>Age</td>
			<td>Code</td>
			<td>Random</td>
		</tr>
		
		<logic:iterate name="listPersonForm" property="persons" id="list">
			<tr>
				<td> <bean:write name="list" property="name" /> </td>
				<td> <bean:write name="list" property="age" /> </td>
				<td> <bean:write name="list" property="cod" /> </td>
				<td> <bean:write name="list" property="random" /> </td>
			</tr>
		</logic:iterate>
			
	</table>
	
	<br/><br/>
		
	<a href="crud.do">back</a>
		
	</body>
</html>