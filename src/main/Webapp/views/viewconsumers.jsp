<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<html>
<center>
<body>
<h1 style="color: orangered;">Consumer Details</h1>  
<table border="2" width="70%" cellpadding="2">  


    <tr>
    <th>Consumer Id</th>
    <th>Consumer Name</th>
    <th>Current Reading</th>
    <th>Previous Reading</th>
    <th>Units</th>
    <th>Service Charge</th>
    <th>Total Bill</th>
</tr>
<c:forEach var="consumer" items="${consumers}">   
    <tr>  
    <td>${consumer.cid}</td>  
    <td>${consumer.cname}</td>  
    <td>${consumer.crreading}</td>  
    <td>${consumer.prreading}</td>  
    <td>${consumer.units}</td> 
    <td>${consumer.service_charges}</td>
    <td>${consumer.total_bill}</td>
      
    <td><a href="/delete/${consumer.cid}">Dlete</a></td>
    <td><a href="/update/${consumer.cid}">Edit</a></td>
   
</tr>  
</c:forEach>  
</table>  
<br/>  
</center>
</body>
</html>
