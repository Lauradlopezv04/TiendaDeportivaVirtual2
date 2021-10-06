<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ventas</title>
    <link href="css/Estilos.css" type="text/css" rel="stylesheet"/>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@200;400;600&display=swap" rel="stylesheet">
</head>
<body>
    <div id="inicio">
        <div class="item-a">
            <h2></h2>
        </div>
        <div class="item-b">
            <a href="./usuarios.jsp">Usuarios</a>
            <a href="./clientes.jsp">Clientes</a>
            <a href="./proveedores.jsp">Proveedores</a>
            <a href="./productos.jsp">Productos</a>
            <a href="./ventas.jsp">Ventas</a>
            <a href="./reportes.jsp">Reportes</a>
        </div>
    </div>
  <form action="GestionVentas.jsp" method="POST">
        <table id="ventas-a">
            <tr class="primera">
                <td>
                    <label for="name">Cedula</label>
                    <input type="text" id="name" name="cedula_cliente">
                </td>
                <td  class="botones"><input type="submit" name="boton" value="Consultar"/></td>
                <td>
                    <label for="name">Cliente</label>
                    <input type="text" id="name" name="nombre_cliente">
                </td>
                <td>
                    <label for="name">Consec</label>
                    <input id="name" name="user_name">
                </td>
            </tr>
        </table>
        <table id="ventas-b">
            <tr class="segunda">
                <td><label for="code_producto">Cod.Producto</label></td>
                <td><label></label></td>
                <td><label for="n_producto">Nombre Producto</label>
                <td class="cantidad"><label for="cantidad">Cantidad</label></td>
                <td class="v_total"><label for="total">Vrl.Total</label></td>
            </tr>
         <!--tercera Fila-->
            <tr class="segunda">
                <td><input type="text" id="code_producto" name="code_producto"></td>
                <td  class="botones"><input type="submit" value="Consultar"/></td>
                <td><input type="text" id="n_producto" name="n_producto"></td>
                <td class="cantidad"><input type="number" id="cantidad" name="cantidad"></td>
                <td class="v_total"><input type="text" id="total" name="valor_total"></td>
            </tr>  
            <!--cuarta Fila-->
            <tr class="segunda">
                <td><input type="text" id="code_producto" name="code_producto"></td>
                <td  class="botones"><input type="submit" value="Consultar"/>
                </td>
                <td><input type="text" id="n_producto" name="n_producto"></td>
                <td class="cantidad"><input type="number" id="cantidad" name="cantidad"></td>
                <td class="v_total"><input type="text" id="total" name="valor_total"></td>
            </tr>  
            <!--quinta Fila-->
            <tr class="segunda">
                <td><input type="text" id="code_producto" name="code_producto"></td>
                <td  class="botones"><input type="submit" value="Consultar"/></td>
                <td><input type="text" id="n_producto" name="n_producto"></td>
                <td class="cantidad"><input type="number" id="cantidad" name="cantidad"></td>
                <td class="v_total"><input type="text" id="total" name="valor_total"></td>
            </tr>  
        </table>
        <table id="ventas-c">
            <tr class="tercera">
                <td><label for="total_ventas">Total Ventas</label>
                <input type="text" id="total_ventas" name="total_ventas"></td>
            </tr>
            <tr class="tercera">
                <td><label for="total_iva">Total IVA</label>
                <input type="text" id="total_iva" name="total_iva"></td>
            </tr>
        </table>
        <table id="ventas-d">
            <tr class="cuarta">
                <td  class="botones"><input type="button" value="Confirmar"/></td>
                <td><label for="ventamasIva">Total con IVA</label>
                <input type="text" id="ventamasIva" name="ventamasIva"></td>
           </tr>
        </table>   
    </form>
</body>
</html>