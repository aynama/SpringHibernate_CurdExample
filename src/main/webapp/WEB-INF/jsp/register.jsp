<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Employees</h1>
        
        <table>
             <tr>
                <th> <h2>  <a href="signup.html"> RESGISTER EMPLOYEE </a></h2>  </th>
               <th>  <h2> <a href="employees.html"> LIST EMPLOYEES </a></h2>   </th>
             </tr>
      </table>
         
         <form action="process_signup.html" method="post">
         
                          <label for="empId">ID:</label><br>
             <input type="text" id="empId" name="empId"><br><br>
             
                          <label for="empName">Employee Name:</label><br>
             <input type="text" id="empName" name="empName"><br><br>
             
                          <label for="designation">Designation:</label><br>
             <input type="text" id="designation" name="designation"><br><br>
             
                          <label for="salary">Salary:</label><br>
             <input type="text" id="salary" name="salary"><br><br>
             
             <input type="submit" value="Submit">
        </form>
         
    </body>
</html>
