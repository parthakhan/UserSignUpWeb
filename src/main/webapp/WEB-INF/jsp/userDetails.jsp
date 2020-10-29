
<html>

<head>
<title>User Details Page</title>


</head>

<body>
	<div>
		
			
		<table>
		<tr>
		<td>
		  User Name:
		</td>
		
		<td>
		${user.getUsername()}
		</td>
		
		</tr>
		<tr>
		<td>
		Password:
		</td>
		<td>
		${user.getPassword()}
		</td>
		</tr>
		<tr>
		<td>
		Email:
		</td>
		<td>
		${user.getEmail()}
		</td>
		</tr>
		<tr>
		<td>
		First Name:
		</td>
		<td>
		${user.getFirstName()}
	    </td>
		</tr>
		<tr>
		<td>
		Last Name:
		</td>
		<td>
		${user.getLastName()}
        </td>
		</tr>
		<tr>
		<td>
		</td>
		<td>
		
		</td>
		</tr>
		</table>
		
	
		
		
	</div>

	

</body>

</html>