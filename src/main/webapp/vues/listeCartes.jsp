<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title><spring:message code="titre.listecartes"/></title>
    </head>
    <body>
        <!--  img src="resources/10ofclubs.png" alt="logo" --> 
        <!--  img src="./resources/10ofclubs.png" alt="logo2" -->  
        <!-- img alt=pseudo1 src="<%=request.getContextPath()%>/resources/135.png" width="100" height="100"-->

        <table border="1">
            <thead>
                <!--
                <tr>
                      
                    <th><spring:message code="colonne.identifiant"/></th>
                    <th><spring:message code="colonne.libelle"/></th>
                   
                </tr>
                 -->
            </thead>
            <tbody>
                <c:forEach items="${listeCartes}" var="carte">
                    <!-- tr-->
                    	<!-- 
                        <td><c:out value="${carte.id}"/></td>
                        <td><c:out value="${carte.libelle}"/></td>
                        -->
                        <img src="<%=request.getContextPath()%>/resources/${carte.id}.png" width="100" height="100" border="5" style="BORDER-TOP-COLOR: #01BBFE; BORDER-LEFT-COLOR: #FE0101; BORDER-RIGHT-COLOR: #20F334;
          BORDER-BOTTOM-COLOR: #000000;">
          
          
                    <!--  /tr -->
                </c:forEach>
            </tbody>
        </table>
        
    </body>
</html>