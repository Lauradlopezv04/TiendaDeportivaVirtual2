package com.DAO.TiendaDeportivaVirtual;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.DTO.TiendaDeportivaVirtual.ProductoVo;
import com.opencsv.CSVReader;



public class ProductoDao extends Conexion {
	public void recorrercsv(String archivo) {
		try {
				Conectar();
				for (ProductoVo producto : leer(archivo)) {
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
	
	public List<ProductoVo> leer(String archivo) throws FileNotFoundException {
		CSVReader entrada = new CSVReader(new FileReader(archivo));
		String[] linea = null;
		List<ProductoVo> listadatos = new ArrayList<ProductoVo>();
		ProductoVo producto = new ProductoVo();
		
		try {
			while ((linea = entrada.readNext()) != null) {
				
				producto.setCodigo_producto(Long.parseLong(linea[0]));
				producto.setNombre_producto(linea[1]);
				producto.setNitproveedor(Long.parseLong(linea[2]));
				producto.setPrecio_compra(Double.parseDouble(linea[3]));
				producto.setIvacompra(Long.parseLong(linea[4]));
				producto.setPrecio_venta(Double.parseDouble(linea[5]));
				listadatos.add(producto);
			}
			entrada.close();
			return listadatos;
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
	


