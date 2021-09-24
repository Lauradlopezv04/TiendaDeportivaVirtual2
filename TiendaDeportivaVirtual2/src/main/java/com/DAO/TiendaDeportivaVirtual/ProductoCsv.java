package com.DAO.TiendaDeportivaVirtual;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.DTO.TiendaDeportivaVirtual.ProductoVo;

public class ProductoCsv {
	String archivo = "tablaprecios.csv";
	BufferedReader leer = null;
	String linea = "";
	String separarcsv = ",";
	ProductoVo producto = new ProductoVo();
	List<ProductoVo> productolista = new ArrayList<ProductoVo>();
	
	public List<ProductoVo> leer() {
		try {
			leer = new BufferedReader(new FileReader(archivo));
			while ((linea = leer.readLine()) != null) {
				String[] datos = linea.split(separarcsv);
				producto.setCodigo_producto(Long.parseLong(datos[0]));
				producto.setNombre_producto(datos[1]);
				producto.setNitproveedor(Long.parseLong(datos[2]));
				producto.setPrecio_compra(Double.parseDouble(datos[3]));
				producto.setIvacompra(Long.parseLong(datos[4]));
				producto.setPrecio_venta(Long.parseLong(datos[5]));
				productolista.add(producto);
			}
			return productolista;
			} catch(Exception e) {
				System.out.println(e);
				return null;
			}
	}
}
