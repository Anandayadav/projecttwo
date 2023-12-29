<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body><center>
<form:form method="POST" action="/editu">
    <h1 style="color:orangered ;">Updation Form</h1>
    <table >
        <table>
            <tr>
            <td> Consumer Id:</td>
            <td><form:input path="cid" /></td>
            </tr>
            <tr>
            <td>Consumer Name:</td>
            <td><form:input path="cname" /></td>
            </tr>
            <tr>
            <td>Current Reading:</td>
            <td><form:input path="crreading" /></td>
            </tr>
            <tr>
            <td>Previous Reading:</td>
            <td><form:input path="prreading"/></td>
            </tr>
            <tr>
          
            <td><input type="submit" value="EditSave" /></td>
            </tr>
            </table>
            </form:form>
            <a href="/viewrecords">View All User Details</a><p></p>
            <a href="/addconsumer">Add New User Here</a>
</center>
</body>
