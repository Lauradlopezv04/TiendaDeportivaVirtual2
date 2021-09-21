<%@ page
    import="
        java.io.*,
        java.util.*,
        com.BO.TiendaDeportivaVirtual.*,com.DTO.TiendaDeportivaVirtual.*"
%>
<%
	ClientesController Cliente =new ClientesController();
    ClienteVo ClienteVo=new ClienteVo();
    long cedula= Long.parseLong(request.getParameter("cedula_cliente"));
    ClienteVo.setCedula_cliente(cedula);
    Cliente.eliminarCliente(ClienteVo.getCedula_cliente());
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clientes</title>
    <link href="css/Estilos.css" type="text/css" rel="stylesheet"/>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@200;400;600&display=swap" rel="stylesheet">
</head>
<body>
    <div id="inicio">
        <div class="item-a">
            <h2></h2>
         </div>
          <div class="item-b">
            <a href="./usuarios.html">Usuarios</a>
            <a href="./clientes.html">Clientes</a>
            <a href="./proveedores.html">Proveedores</a>
            <a href="./productos.html">Productos</a>
            <a href="./ventas.html">Ventas</a>
            <a href="./reportes.html">Reportes</a>
          </div>
     </div>

    <div id="reclientes">
        <form method="POST">
            <table>
                <tr>
                    <td>
                        <label for="document">C�dula</label>
                        <input type="text" id="document" name="cedula_cliente"/>
                    </td>
                    <td>
                        <label for="phone">Tel�fono</label>
                        <input type="text" id="phone" name="telefono_cliente"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <br>
                        <label for="name">Nombre Completo</label>
                        <input type="text" id="name" name="nombre_cliente"/>
                    </td>
                    <td>
                        <label for="mail">Correo Electr�nico</label>
                        <input type="email" id="mail" name="email_cliente"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <br>
                        <label for="address">Direcci�n</label>
                        <input type="text" id="address" name="direccion_cliente"/>
                    </td>
                </tr>
                <tr class="botones">
                    <td><input type="submit" value="Consultar" formaction="ConsultarCliente.jsp"/>
                        <input type="submit" value="Crear" formaction="CrearCliente.jsp"/>
                        <input type="submit" value="Actualizar" formaction="ActualizarCliente.jsp"/>
                        <input type="submit" value="Borrar" formaction="EliminarCliente.jsp" />
                    </td>
                </tr>
            </table>    
        </form>
    </div>
</body>
</html>