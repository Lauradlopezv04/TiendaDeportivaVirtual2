package com.DAO.TiendaDeportivaVirtual;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DTO.TiendaDeportivaVirtual.ClienteVo;

public class ClienteDao extends Conexion {
	public void registrarCliente(ClienteVo Cliente) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("insert into clientes(cedula_cliente, direccion_cliente, email_cliente, nombre_cliente, telefono_cliente) values (?,?,?,?,?)");
			sentencia.setLong(1, Cliente.getCedula_cliente());
			sentencia.setString(2, Cliente.getDireccion_cliente());
			sentencia.setString(3, Cliente.getEmail_cliente());
			sentencia.setString(4, Cliente.getNombre_cliente());
			sentencia.setString(5, Cliente.getTelefono_cliente());
			sentencia.executeUpdate();
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void actualizarCliente(ClienteVo Cliente) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("update clientes set direccion_cliente=?, email_cliente = ?, nombre_cliente = ?, telefono_cliente = ? where cedula_cliente = ?");
			sentencia.setString(1, Cliente.getDireccion_cliente());
			sentencia.setString(2, Cliente.getEmail_cliente());
			sentencia.setString(3, Cliente.getNombre_cliente());
			sentencia.setString(4, Cliente.getTelefono_cliente());
			sentencia.setLong(5, Cliente.getCedula_cliente());
			sentencia.executeUpdate();
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void eliminarCliente(Long cedula_cliente) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("delefe from clientes where cedula_cliente = ?");
			sentencia.setLong(1, cedula_cliente);
			sentencia.executeUpdate();
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public ClienteVo consultarCliente(Long cedula_cliente) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("select * from clientes where cedula_cliente = ?");
			sentencia.setLong(1, cedula_cliente);
			ResultSet datos = sentencia.executeQuery();
			if (datos.next()) {
				ClienteVo Cliente = new ClienteVo();
				Cliente.setCedula_cliente(datos.getLong("cedula_cliente"));
				Cliente.setDireccion_cliente(datos.getString("direccion_cliente"));
				Cliente.setEmail_cliente(datos.getString("email_cliente"));
				Cliente.setNombre_cliente(datos.getString("nombre_cliente"));
				Cliente.setTelefono_cliente(datos.getString("telefono_cliente"));
				return Cliente;
			}
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
		return null;
	}
}