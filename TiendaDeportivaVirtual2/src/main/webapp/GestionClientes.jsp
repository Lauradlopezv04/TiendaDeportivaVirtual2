<%@ page
    import="
        java.io.*,
        java.util.*,
        com.BO.TiendaDeportivaVirtual.*,com.DTO.TiendaDeportivaVirtual.*"
%>
<%
	long cedula_cliente= 0;
	String nombre_cliente="";
	String direccion_cliente="";
	String telefono_cliente="";
	String email_cliente="";
	ClientesController cliente= new ClientesController();
	ClienteVo clienteVo= new ClienteVo();
    String opcion=request.getParameter("boton");
    try{
    if(opcion.equals("Consultar")){
    	cedula_cliente= Long.parseLong(request.getParameter("cedula_cliente"));
        clienteVo.setCedula_cliente(cedula_cliente);
        clienteVo=cliente.consultarCliente(cedula_cliente);
        nombre_cliente= clienteVo.getNombre_cliente();
        direccion_cliente= clienteVo.getDireccion_cliente();
        telefono_cliente= clienteVo.getTelefono_cliente();
        email_cliente= clienteVo.getEmail_cliente();
        if(clienteVo.getCedula_cliente()==0){
    		request.getRequestDispatcher("usuarios.jsp").forward(request, response);
    	}
    }
    else if(opcion.equals("Crear")){
    	cedula_cliente= Long.parseLong(request.getParameter("cedula_cliente"));
        clienteVo.setCedula_cliente(cedula_cliente);
        clienteVo.setNombre_cliente(request.getParameter("nombre_cliente"));
        clienteVo.setDireccion_cliente(request.getParameter("direccion_cliente"));
        clienteVo.setTelefono_cliente(request.getParameter("telefono_cliente"));
        clienteVo.setEmail_cliente(request.getParameter("email_cliente"));
        cliente.registrarCliente(clienteVo);
    }
    else if(opcion.equals("Actualizar")){
        cedula_cliente= Long.parseLong(request.getParameter("cedula_cliente"));
        clienteVo.setCedula_cliente(cedula_cliente);
        clienteVo.setNombre_cliente(request.getParameter("nombre_cliente"));
        clienteVo.setDireccion_cliente(request.getParameter("direccion_cliente"));
        clienteVo.setTelefono_cliente(request.getParameter("telefono_cliente"));
        clienteVo.setEmail_cliente(request.getParameter("email_cliente"));
        cliente.actualizarCliente(clienteVo);
    }
    else if(opcion.equals("Borrar")){
        cedula_cliente= Long.parseLong(request.getParameter("cedula_cliente"));
        clienteVo.setCedula_cliente(cedula_cliente);
        cliente.eliminarCliente(clienteVo.getCedula_cliente());
    }
    }catch (Exception e){
    	request.getRequestDispatcher("clientes.jsp").forward(request, response);
    }
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
            <a href="./usuarios.jsp">Usuarios</a>
            <a href="./clientes.jsp">Clientes</a>
            <a href="./proveedores.jsp">Proveedores</a>
            <a href="./productos.jsp">Productos</a>
            <a href="./ventas.jsp">Ventas</a>
            <a href="./reportes.jsp">Reportes</a>
          </div>
     </div>

    <div id="reclientes">
        <form action="GestionClientes.jsp" method="POST">
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
                    <td><input type="submit" name="boton" value="Consultar"/>
                        <input type="submit" name="boton" value="Crear"/>
                        <input type="submit" name="boton" value="Actualizar" />
                        <input type="submit" name="boton" value="Borrar"/>
                    </td>
                </tr>
            </table>    
        </form>
    </div>
</body>
</html>