<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.DAO.TiendaDeportivaVirtual.*, java.util.*, com.DTO.TiendaDeportivaVirtual.*" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <% 
    ProductoCsv csvarchivo = new ProductoCsv();
    
    %>
</head>
<body>
	<table>
	<tr>
		<td>Codigo de producto</td>
		<td>Nombre de producto</td>
		<td>Nit proveedor</td>
		<td>Precio de Compra</td>
		<td>Iva</td>
		<td>Precio de Venta</td>	
	</tr>
		<% for (ProductoVo producto : csvarchivo.leer()) { %>
		<tr>
			<td><% pageContext.getOut().println(producto.getCodigo_producto()); %></td>
			<td><% pageContext.getOut().println(producto.getNombre_producto()); %></td>
			<td><% pageContext.getOut().println(producto.getNitproveedor()); %></td>
			<td><% pageContext.getOut().println(producto.getPrecio_compra()); %></td>
			<td><% pageContext.getOut().println(producto.getIvacompra()); %> </td>
			<td><% pageContext.getOut().println(producto.getPrecio_venta()); %></td>
		</tr>	
		<% } %>
	
	</table>
</body>
</html>