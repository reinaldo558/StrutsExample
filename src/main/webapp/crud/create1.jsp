<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
	<head></head>
	<body>
		
		<html:form action="/create">
			<html:hidden property="action" value="C2"/>
		
			<span style="font-weight: bold; font-size: large; color: red;">C</span><span style="font-size: large;">reate</span><br/><br/>
			
			<table>
				<tr>
					<td>Name:</td>
					<td><html:text property="name" size="40" /></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><html:text property="age" size="6" maxlength="3" /></td>
				</tr>
			</table>
			
			<br/><br/>

			<html:submit value="save" />
		
		</html:form>
		
		<br/><br/>
		
		<a href="crud.do">back</a>
			
	</body>
</html>