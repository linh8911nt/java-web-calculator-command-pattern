<%--
  Created by IntelliJ IDEA.
  User: nguyenthanhlinh
  Date: 5/22/18
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      .login {
        height:280px; width:230px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
      }
      .login input {
        padding:5px; margin:5px
      }
    </style>
  </head>
  <body>
  <form method="post" action="/calculator">
    <div class="login">
      <h2>services.Calculator</h2>
      First Operand:
      <input type="text" name="firstOperand" size="30"  placeholder="First Operand" />
      Operator:
      <select name="operator">
        <option value="-">sub (-)</option>
        <option value="+">add (+)</option>
      </select><br>
      Second Operand:
      <input type="text" name="secondOperand" size="30" placeholder="Second Operand" /><br>
      Result ${firstOperand} ${operator} ${secondOperand} = ${result}
      <br>
      <input type="submit" value="Calculate"/>
    </div>
  </form>
  </body>
</html>
