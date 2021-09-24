<%@ page
    import="
        java.io.*,
        java.util.*,
        com.BO.TiendaDeportivaVirtual.*,com.DTO.TiendaDeportivaVirtual.*"
%>
<%
	long Nit = 0;
	String telefono="";
	String nombrepro="";
	String ciudad="";
	String direccion="";
	ProveedoresController proveedor =new ProveedoresController();
    ProveedorVo ProveedorVo=new ProveedorVo();
    String opcion=request.getParameter("boton");
    try{
    if(opcion.equals("Consultar")){
    	long nit= Long.parseLong(request.getParameter("Nit"));
        ProveedorVo.setNit(nit);
    	ProveedorVo=proveedor.consultarProveedor(nit);
    	telefono= ProveedorVo.getTelefono_proveedor();
    	nombrepro= ProveedorVo.getNombre_proveedor();
    	ciudad= ProveedorVo.getCiudad_proveedor();
    	direccion= ProveedorVo.getDireccion_proveedor();
    	if(ProveedorVo.getNit()==0){
    		request.getRequestDispatcher("proveedores.jsp").forward(request, response);
    	}

    }
    else if(opcion.equals("Crear")){
    	long nit= Long.parseLong(request.getParameter("Nit"));
    	ProveedorVo.setNit(nit);
        ProveedorVo.setTelefono_proveedor(request.getParameter("telefono_proveedor"));
        ProveedorVo.setNombre_proveedor(request.getParameter("nombre_proveedore"));
        ProveedorVo.setCiudad_proveedor(request.getParameter("ciudad_proveedor"));
        ProveedorVo.setDireccion_proveedor(request.getParameter("direccion_proveedor"));
        proveedor.registrarProveedor(ProveedorVo);
    }
    else if(opcion.equals("Actualizar")){
    	long nit= Long.parseLong(request.getParameter("Nit"));
    	ProveedorVo.setNit(nit);
   	    ProveedorVo.setTelefono_proveedor(request.getParameter("telefono_proveedor"));
        ProveedorVo.setNombre_proveedor(request.getParameter("nombre_proveedore"));
        ProveedorVo.setCiudad_proveedor(request.getParameter("ciudad_proveedor"));
        ProveedorVo.setDireccion_proveedor(request.getParameter("direccion_proveedor"));
        proveedor.actualizarProveedor(ProveedorVo);
    }
    else if(opcion.equals("Borrar")){
    	long nit= Long.parseLong(request.getParameter("Nit"));
    	ProveedorVo.setNit(nit);
    	    proveedor.eliminarProveedor(ProveedorVo.getNit());
    }
    }catch (Exception e){
    	request.getRequestDispatcher("proveedores.jsp").forward(request, response);
    }
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
            <a href="./usuarios.jsp">Usuarios</a>
            <a href="./clientes.jsp">Clientes</a>
            <a href="./proveedores.jsp">Proveedores</a>
            <a href="./productos.jsp">Productos</a>
            <a href="./ventas.jsp">Ventas</a>
            <a href="./reportes.jsp">Reportes</a>
          </div>
        </div>

    <div id="reproveedores">
    	<form action="GestionProveedores.jsp" method="POST">
	        <table>
	            <tr>
	                <td>
	                    <label for="nit">NIT</label>
	                    <input type="text" id="nit" name="Nit" value="<%=ProveedorVo.getNit() %>"/>
	                </td>
	                <td>
	                <label for="phone">Teléfono</label>
	                <input type="text" id="phone" name="telefono_proveedor" value="<%=ProveedorVo.getTelefono_proveedor() %>"/>
	            </td>
	            </tr>
	            <tr>
	                <td>
	                    <br>
	                    <label for="supplier">Nombre Proveedor</label>
	                    <input type="text" id="supplier" name="nombre_proveedore" value="<%=ProveedorVo.getNombre_proveedor() %>"/>
	                </td>
	                <td>
	                    <label for="city">Ciudad</label>
	                    <input type="text" id="city" name="ciudad_proveedor" value="<%=ProveedorVo.getCiudad_proveedor() %>"/>
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <br>
	                    <label for="address">Dirección</label>
	                    <input type="text" id="address" name="direccion_proveedor" value="<%=ProveedorVo.getDireccion_proveedor() %>"/>
	                </td>
	            </tr>
	            <tr class="botones">
	                <td>
	                    <input type="submit" name="boton" value="Consultar"/>
                    	<input type="submit" name="boton"  value="Crear"/>
                    	<input type="submit" name="boton"value="Actualizar"/>
                    	<input type="submit" name="boton" value="Borrar"/>
                    	<input onclick="limpiar()" type="submit" value="Limpiar"></input>
                    	<script>
                    	function limpiar() {
                    	    document.getElementById("cedula_usuario").value = "";
                    	    document.getElementById("usuario").value = "";
                    	    document.getElementById("nombre_usuario").value = "";
                    	    document.getElementById("contrasena").value = "";
                    	    document.getElementById("email_usuario").value = "";
                    	}</script>
	                </td>
	            </tr>
	           
	        </table> 
	     </form>
	 </div>
           
</body>
</html>