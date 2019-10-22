<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
	<head></head>
	<body>
		<span style="font-weight: bold; font-size: large; color: red;">C</span><span style="font-size: large;">reate</span><br/><br/>
			
		User created <br/><br/>
	
		Name: <span style="font-weight: bold; color: #555;"><bean:write name="personForm" property="name" /></span> <br/>
		Age: <span style="font-weight: bold; color: #555;"><bean:write name="personForm" property="age" /></span> <br/>
		Cod: <span style="font-weight: bold; color: #555;"><bean:write name="personForm" property="cod" /></span> <br/>
		Random: <span style="font-weight: bold; color: #555;"><bean:write name="personForm" property="random" /></span> <br/>
	
		<br/><br/>
		
		<a href="crud.do">back</a>
		
	</body>
</html>