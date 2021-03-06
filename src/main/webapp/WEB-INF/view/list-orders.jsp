<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Orders Tracker</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Customer</th>
                <th>Price</th>
                <th>Date of Order</th>
            </tr>
            
            <c:forEach var="order" items="${orders}">
            <tr>
                <td>${order.customer}</td>
                <td>${order.price}</td>
                <td>${order.dateOfOrder}</td>
                <td>
                    <a href="/springHibernate/order/viewOrder?orderId=${order.id}">Update</a>
                    | | <a href="/springHibernate/order/deleteOrder?orderId=${order.id}" onclick="if(!confirm('Are you sure?')) return false;">Delete</a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>