<%-- 
    Document   : mainCuenta
    Created on : 07/07/2015, 07:10:57 AM
    Author     : hp
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:out value="${saludo}"/>
        
        <h1>Administracion de Cuentas!</h1>
        <a href="dmp1.upeu">Regresar inicio</a> &emsp14;
        <a href="formCuenta.upeu">Crear Cuenta</a>
        
        
        <div id="idFormulario" align="center">
            
        <form  id="formBuscar" action="buscarCuentax.upeu"  method="post" name="formBuscar" >
        <table align="center"  class="myform">
        
        <tr align="center">
        &nbsp;&nbsp;
        <td  style="color:black">
        Cuenta <input type="text" class="myinput" id="cuenta" size="50" name="cuenta"  value="">
        
        <input  type="submit"  class="button2" value="Buscar" >&nbsp;
        </td>
        </tr>
        </table>
        </form>
        </div> 
        
        
        <c:if test="${!empty ListaCuenta}">
            <table >
                <tr>
                    <th>Nombre Elemento</th>
                    <th>Elemento Codigo</th>
                    <th>Nombre Cuenta</th>
                    <th>Cuenta Codigo</th>
                    <th>Nombre Sub Cuenta</th>
                    <th>Sub Cuenta Codigo</th>
                    <th>Nombre Division</th>
                    <th>Division Codigo</th>
                    <th>Nombre Sub Division</th>
                    <th>Sub Division Codigo</th>
                    <th>Descripcion</th>
                    <th>Condicion</th>
                    <th>Estado</th>
                    <th>Opciones</th>
                    
                </tr>
                
                <c:forEach items="${ListaCuenta}" var= "dato">   
                <tr>
                    <td><c:out value="${dato.nombreelemento}"/></td>
                    <td><c:out value="${dato.elementocodigo}"/></td>
                    <td><c:out value="${dato.nombrecuenta}"/></td>
                    <td><c:out value="${dato.cuentacodigo}"/></td>
                    <td><c:out value="${dato.nombresubcuenta}"/></td>
                    <td><c:out value="${dato.subcuentacodigo}"/></td>
                    <td><c:out value="${dato.nombredivision}"/></td>
                    <td><c:out value="${dato.divisioncodigo}"/></td>
                    <td><c:out value="${dato.nombresubdivision}"/></td>
                    <td><c:out value="${dato.subdivisioncodigo}"/></td>
                    <td><c:out value="${dato.descripcion}"/></td>
                    <td><c:out value="${dato.condicion}"/></td>
                    <td><c:out value="${dato.estado}"/></td>
                    <td></td>
                    <td>
                        <a href="eliminarcuen.upeu?idcuentax=${dato.idCuenta}">Eliminar</a>&emsp14;
                        <a href="modificarCuentaX.upeu?idCuenta=${dato.idCuenta}">Modificar</a>
                    </td>
                    
                </tr>
                </c:forEach>
            </table>
        </c:if>    
    </body>
</html>
