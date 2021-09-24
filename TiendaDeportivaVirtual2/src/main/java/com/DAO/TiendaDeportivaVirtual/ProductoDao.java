package com.DAO.TiendaDeportivaVirtual;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.PreparedStatement;

import com.DTO.TiendaDeportivaVirtual.ProductoVo;

public class ProductoDao extends Conexion {
	public void recorrercsv() {
		try {
			Conectar();
			ProductoCsv lista = new ProductoCsv();
			for (ProductoVo producto : lista.leer()) {
				PreparedStatement sentencia = Conexion.prepareStatement("insert into productos(codigo_producto, nombre_producto, Nitproveedor, precio_compra, iva, precio_venta) values (?,?,?,?,?,?)");
				sentencia.setLong(1, producto.getCodigo_producto());
				sentencia.setString(2, producto.getNombre_producto());
				sentencia.setLong(3, producto.getNitproveedor());
				sentencia.setDouble(4, producto.getPrecio_compra());
				sentencia.setLong(5, producto.getIvacompra());
				sentencia.setDouble(6, producto.getPrecio_venta());
				sentencia.executeUpdate();
				Desconectar();
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public boolean examinarcsv() throws IOException {
		try {
		File archivo = new File("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo3/TiendaDeportivaVirtual2/TiendaDeportivaVirtual2/src/main/webapp/tablaprecios.csv");
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
	

