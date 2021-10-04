package com.DAO.TiendaDeportivaVirtual;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.DTO.TiendaDeportivaVirtual.ProductoVo;




public class ProductoDao extends Conexion {
	public void recorrercsv(String archivo) {
		BufferedReader leer = null;
		String linea = "";
		String separar = ",";
		try {
			leer = new BufferedReader(new FileReader(archivo));
			while ((linea = leer.readLine()) != null) {
				String[] datos = linea.split(separar);
				ProductoVo producto = new ProductoVo();
				producto.setCodigo_producto(Long.parseLong(datos[0]));
				producto.setNombre_producto(datos[1]);
				producto.setNitproveedor(Long.parseLong(datos[2]));
				producto.setPrecio_compra(Double.parseDouble(datos[3]));
				producto.setIvacompra(Double.parseDouble(datos[4]));
				producto.setPrecio_venta(Double.parseDouble(datos[5]));
				
				Conectar();
				PreparedStatement consulta = Conexion.prepareStatement("select * from proveedores where Nit = ?");
				consulta.setLong(1, producto.getNitproveedor());
				ResultSet res = consulta.executeQuery();
				if (!res.isBeforeFirst() ) {
					System.out.println("no existe el nit " + producto.getNitproveedor());
				} else {
					PreparedStatement sentencia = Conexion.prepareStatement("insert into productos(codigo_producto, nombre_producto, Nitproveedor, precio_compra, ivacompra, precio_venta) values (?,?,?,?,?,?)");
					sentencia.setLong(1, producto.getCodigo_producto());
					sentencia.setString(2, producto.getNombre_producto());
					sentencia.setLong(3, producto.getNitproveedor());
					sentencia.setDouble(4, producto.getPrecio_compra());
					sentencia.setDouble(5, producto.getIvacompra());
					sentencia.setDouble(6, producto.getPrecio_venta());
					sentencia.executeUpdate();
				}
			}
			Desconectar();
			}catch(Exception e) {
				System.out.println(e);
			}
	}
	
	
	public boolean examinarcsv(String dirarchivo) throws IOException {
		try {
		File archivo = new File(dirarchivo);
		String tipo = Files.probeContentType(archivo.toPath());
		if (tipo == "application/vnd.ms-excel") {
			return true;
		} else {
			return false;
		}
		} catch(Exception e) {
			return false;
		}
	}
}