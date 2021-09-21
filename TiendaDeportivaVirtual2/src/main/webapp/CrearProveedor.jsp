<%@ page
    import="
        java.io.*,
        java.util.*,
        com.BO.TiendaDeportivaVirtual.*,com.DTO.TiendaDeportivaVirtual.*"
%>
<%
	ProveedoresController proveedor =new ProveedoresController();
    ProveedorVo proveedorVo=new ProveedorVo();
    long nit= Long.parseLong(request.getParameter("Nit"));
    proveedorVo.setNit(nit);
    proveedorVo.setNombre_proveedor(request.getParameter("nombre_proveedor"));
    proveedorVo.setDireccion_proveedor(request.getParameter("direccion_proveedor"));
    proveedorVo.setTelefono_proveedor(request.getParameter("telefono_proveedor"));
    proveedorVo.setCiudad_proveedor(request.getParameter("ciudad_proveedor"));
    proveedor.registrarProveedor(proveedorVo);
%>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proveedores</title>
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
            <a href="#infopersonal">Ventas</a>
            <a href="./reportes.html">Reportes</a>
          </div>
        </div>

    <div id="reproveedores">
    	<form method="POST">
	        <table>
	            <tr>
	                <td>
	                    <label for="nit">NIT</label>
	                    <input type="text" id="nit" name="Nit"/>
	                </td>
	                <td>
	                <label for="phone">Teléfono</label>
	                <input type="text" id="phone" name="telefono_proveedor"/>
	            </td>
	            </tr>
	            <tr>
	                <td>
	                    <br>
	                    <label for="supplier">Nombre Proveedor</label>
	                    <input type="text" id="supplier" name="nombre_proveedor"/>
	                </td>
	                <td>
	                    <label for="city">Ciudad</label>
	                    <input type="text" id="city" name="ciudad_proveedor"/>
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <br>
	                    <label for="address">Dirección</label>
	                    <input type="text" id="address" name="direccion_proveedor"/>
	                </td>
	            </tr>
	            <tr class="botones">
	                <td><input type="submit" value="Consultar"/>
	                    <input type="submit" value="Crear" formaction="CrearProveedor.jsp"/>
	                    <input type="submit" value="Actualizar" formaction="ActualizarProveedor.jsp"/>
	                    <input type="submit" value="Borrar" formaction="EliminarProveedor.jsp"/>
	                </td>
	            </tr>
	           
	        </table> 
	     </form>
	 </div>
           
</body>
</html>