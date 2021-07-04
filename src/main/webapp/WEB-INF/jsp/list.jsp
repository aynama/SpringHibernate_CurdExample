<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
                                  table, th, td {
                                  border: 1px solid black;
                                   border-collapse: collapse;
                }
        </style>
    </head>
    <body>
        <h1>Employees</h1>
        
        <h2> <a href="signup.html"> RESGISTER EMPLOYEE </a></h2>
         <h2> <a href="list.html"> LIST EMPLOYEES </a></h2>
         
         <h1> ${message} </h1>
         <hr>
       <table>
             <tr>
                <th>Emp Id </th>
                <th> Emp Name </th>
               <th> Designation </th>
               <th> Salary </th>
             </tr>
             
             <c:forEach items="${employees}" var="emp">
               <tr>
                  <td>${emp.empId}</td>
                   <td>${emp.empName}</td>
                    <td>${emp.designation}</td>
                     <td>${emp.salary}</td>
               </tr>
             </c:forEach>
             
      </table>
    </body>
</html>
