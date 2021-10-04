package com.DAO.TiendaDeportivaVirtual;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.DTO.TiendaDeportivaVirtual.ProductoVo;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;



public class ProductoDao extends Conexion {
		public void ListarProducto (ProductoVo producto){
			FileReader archCSV= null;
			CSVReader csvReader= null;
			try {
				archCSV= (new FileReader(producto.getArchivo()));
				CSVParser PuntoyComa= new CSVParserBuilder().withSeparator(';').build();
				csvReader= new CSVReaderBuilder(archCSV).withCSVParser(PuntoyComa).build();
				String[] fila=null;
				ArrayList<String> lista= new ArrayList<String>();
				while((fila = csvReader.readNext()) != null){
					lista.add(fila[0]);
					lista.add(fila[1]);
					lista.add(fila[2]);
					lista.add(fila[3]);
					lista.add(fila[4]);
					lista.add(fila[5]);
					String valor=lista.get(0);
					valor=valor.replaceAll("[^\\d]", "");
					System.out.println("aqui es el error");
					long codigo_producto=Long.parseLong(valor);
					String nombre_producto=lista.get(1);
					long nit_proveedor= Long.parseLong(lista.get(2));
					double precio_compra=Double.parseDouble(lista.get(3));
					double iva_compra= Double.parseDouble(lista.get(4));
					double precio_venta=Double.parseDouble(lista.get(5));
					producto.setCodigo_producto(codigo_producto);
					producto.setNombre_producto(nombre_producto);
					producto.setNitproveedor(nit_proveedor);
					producto.setPrecio_compra(precio_compra);
					producto.setIvacompra(iva_compra);
					producto.setPrecio_venta(precio_venta);
					Conectar();
					PreparedStatement consulta = Conexion.prepareStatement("SELECT * FROM proveedores where Nit=?");
					consulta.setLong(1, nit_proveedor);
					ResultSet rs= consulta.executeQuery();
					if(rs == null) {
						System.out.println("No exsite el nit "+lista.get(2));
					}
					for(int i = 0; i< lista.size();i++) {
						PreparedStatement sentencia = Conexion.prepareStatement("insert into productos(codigo_producto, nombre_producto, Nitproveedor, precio_compra, ivacompra, precio_venta) values (?,?,?,?,?,?)");
						sentencia.setLong(1, producto.getCodigo_producto());
						sentencia.setString(2, producto.getNombre_producto());
						sentencia.setLong(3, producto.getNitproveedor());
						sentencia.setDouble(4, producto.getPrecio_compra());
						sentencia.setDouble(5, producto.getIvacompra());
						sentencia.setDouble(6, producto.getPrecio_venta());
						sentencia.executeUpdate();
						System.out.println(lista.size());
						}
					}
	
				Desconectar();
				}
			catch(Exception e) {
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
	


