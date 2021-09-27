<%@ page
    import="
        java.io.*,
        java.util.*,
        com.BO.TiendaDeportivaVirtual.*,
        com.DTO.TiendaDeportivaVirtual.*"
%>
<%
ProductoController producto= new ProductoController();
ProductoVo productoVo= new ProductoVo();
String opcion=(request.getParameter("boton"));
if (opcion.equals("Examinar")){
	String archivodireccion = request.getParameter("fileupload");
	producto.examinarcsv(archivodireccion);
	System.out.println(archivodireccion);
}
else if(opcion.equals("Cargar")){
	String archivodireccion = request.getParameter("fileupload");
	System.out.println(archivodireccion);
	producto.recorrercsv(archivodireccion);
}
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Productos</title>
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
      
    <div id="productos">
    <form method="POST">
            <table>
                <tr class="examinar">
                    <td><label for="archivo">Nombre del Archivo</label></td>
                    <td><input type="file" id="archivo" name="fileupload"  accept="text/csv"/></td>
                    <td class="botones"><input type="submit" name="boton" value="Examinar"/></td>
                </tr>
                <tr class="cargar">
                    <td class="botones"><input type="submit" name="boton" value="Cargar"/>
                </tr>
            </table> 
      </form>
    </div>
</body>
</html>