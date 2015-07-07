<%-- 
    Document   : formCuenta
    Created on : 07/07/2015, 07:10:34 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <c:url var="savecuentax"  value="guardarCuenta.upeu" />
            <fm:form modelAttribute="modeloCuenta" method="post" action="${savecuentax}">
                <table>
                    <tr>
                        <td><fm:label path="nombreelemento">Nombre de Elemento</fm:label> </td>
                        <td><fm:input path="nombreelemento" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="elementocodigo">Elemento Codigo</fm:label> </td>
                        <td><fm:input path="elementocodigo" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="nombrecuenta">Nombre de Cuenta</fm:label> </td>
                        <td><fm:input path="nombrecuenta" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="cuentacodigo">Cuenta Codigo</fm:label> </td>
                        <td><fm:input path="cuentacodigo" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="nombresubcuenta">Nombre Sub Cuenta </fm:label> </td>
                        <td><fm:input path="nombresubcuenta" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="subcuentacodigo">Sub Cuenta Codigo</fm:label> </td>
                        <td><fm:input path="subcuentacodigo" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="nombredivision">Nombre Division</fm:label> </td>
                        <td><fm:input path="nombredivision" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="divisioncodigo">Division Contigo</fm:label> </td>
                        <td><fm:input path="divisioncodigo" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="sombresubdivision">Nombre Sub Division</fm:label> </td>
                        <td><fm:input path="sombresubdivision" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="subdivisioncodigo">Sub Division Codigo</fm:label> </td>
                        <td><fm:input path="subdivisioncodigo" size="60" /></td>
                    </tr>
                     <tr>
                        <td><fm:label path="descripcion">Descripci&oacute;n</fm:label> </td>
                        <td><fm:input path="descripcion" size="60" /></td>
                    </tr>
                 
                    <tr>
                        <td><fm:label path="estado">Estado:</fm:label> </td>
                        <td>
                        <fm:select path="estado">
                            <fm:option value="1">Activo</fm:option>
                            <fm:option value="0">Desactivo</fm:option>
                        </fm:select>
                            
                        </td>
                    </tr>
                     <tr>
                        <td><fm:label path="condicion">Condici&oacute;n</fm:label> </td>
                        <td><fm:input path="condicion" size="60" /></td>
                    </tr>
                    
                    <tr>                        
                        <td colspan="2"><input type="submit" value="Enviar" > </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>
