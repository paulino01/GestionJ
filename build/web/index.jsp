<%-- 
    Document   : index
    Created on : 4 nov 2020, 15:00:10
    Author     : paulino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <%@ page import="controller.registro" %>
        <h1>Hola, proporciona los datos</h1>
        <<h2>del producto</h2>
        <<form action="registro" method="post">
            <p>
            <label for="clave">Clave:</label>
            <input type="text" name="clave">
            </p>
            
            <p>
                <label for="nombre">Nombre</label>
                <input type="text" name="nombre">
            </p>
            
            <p>
                <label for="precio"> Precio:</label>
                <input type="text" name="precio">
                
            </p>
            
            <p>
                <label for="cantidad">Cantidad</label>
                <input type="text" name="cantidad">
            </p>
            
            <input type="reset" value="Borrar">
            <input type="submit" value="Registrar">
        </form>
        
        <form action="muestraProductos" metod="post">
            <input type="submit" value="Ver Productos">
        </form>
    </body>
</html>
