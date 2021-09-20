package com.DAO.TiendaDeportivaVirtual;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.DTO.TiendaDeportivaVirtual.ProveedorVo;

public class proveedoresDao extends Conexion{
	public void registrarProveedor(ProveedorVo Proveedor) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("insert into proveedores(Nit,nombre_proveedor,direccion_proveedor,telefono_proveedor,ciudad_proveedor) values (?,?,?,?,?)");
			sentencia.setLong(1, Proveedor.getNit());
			sentencia.setString(2, Proveedor.getNombre_proveedor());
			sentencia.setString(3, Proveedor.getDireccion_proveedor());
			sentencia.setString(4, Proveedor.getTelefono_proveedor());
			sentencia.setString(5, Proveedor.getCiudad_proveedor());
			sentencia.executeUpdate();
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void actualizarProveedor(ProveedorVo Proveedor) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("update proveedores set nombre_proveedor = ?,direccion_proveedor  = ?, telefono_proveedor = ?, ciudad_proveedor = ? where Nit = ?");
			sentencia.setString(1, Proveedor.getNombre_proveedor());
			sentencia.setString(2, Proveedor.getDireccion_proveedor());
			sentencia.setString(3, Proveedor.getTelefono_proveedor());
			sentencia.setString(4, Proveedor.getCiudad_proveedor());
			sentencia.setLong(5, Proveedor.getNit());
			sentencia.executeUpdate();
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void eliminarProveedor(Long Nit) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("delefe from proveedores where Nit = ?");
			sentencia.setLong(1, Nit);
			sentencia.executeUpdate();
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public ProveedorVo consultarProveedor(Long Nit) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("select * from proveedores where Nit = ?");
			sentencia.setLong(1, Nit);
			ResultSet datos = sentencia.executeQuery();
			if (datos.next()) {
				ProveedorVo Proveedor = new ProveedorVo();
				Proveedor.setNit(datos.getLong("Nit"));
				Proveedor.setNombre_proveedor(datos.getString("nombre_proveedor"));
				Proveedor.setDireccion_proveedor(datos.getString("direccion_Proveedor"));
				Proveedor.setTelefono_proveedor(datos.getString("telefono_proveedor"));
				Proveedor.setCiudad_proveedor(datos.getString("ciudad_proveedor"));
				return Proveedor;
			}
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
		return null;
	}
}