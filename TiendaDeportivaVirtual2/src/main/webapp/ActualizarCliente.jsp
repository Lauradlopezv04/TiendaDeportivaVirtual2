<%@ page
    import="
        java.io.*,
        java.util.*,
        com.BO.TiendaDeportivaVirtual.*,com.DTO.TiendaDeportivaVirtual.*"
%>
<%
	ClientesController cliente= new ClientesController();
	ClienteVo clienteVo= new ClienteVo();
    long cedula_cliente= Long.parseLong(request.getParameter("cedula_cliente"));
    clienteVo.setCedula_cliente(cedula_cliente);
    clienteVo.setNombre_cliente(request.getParameter("nombre_cliente"));
    clienteVo.setDireccion_cliente(request.getParameter("direccion_cliente"));
    clienteVo.setTelefono_cliente(request.getParameter("telefono_cliente"));
    clienteVo.setEmail_cliente(request.getParameter("email_cliente"));
    cliente.actualizarCliente(clienteVo);
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
                        <label for="document">Cédula</label>
                        <input type="text" id="document" name="cedula_cliente"/>
                    </td>
                    <td>
                        <label for="phone">Teléfono</label>
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
                        <label for="mail">Correo Electrónico</label>
                        <input type="email" id="mail" name="email_cliente"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <br>
                        <label for="address">Dirección</label>
                        <input type="text" id="address" name="direccion_cliente"/>
                    </td>
                </tr>
                <tr class="botones">
                    <td><input type="submit" value="Consultar"/>
                        <input type="submit" value="Crear" formaction="CrearCliente.jsp"/>
                        <input type="submit" value="Actualizar" formaction="ActualizarCliente.jsp"/>
                        <input type="submit" value="Borrar"/>
                    </td>
                </tr>
            </table>    
        </form>
    </div>
</body>
</html>