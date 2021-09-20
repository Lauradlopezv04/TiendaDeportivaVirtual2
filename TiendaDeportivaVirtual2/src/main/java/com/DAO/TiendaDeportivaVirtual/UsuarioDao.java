package com.DAO.TiendaDeportivaVirtual;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.DAO.TiendaDeportivaVirtual.UsuarioDao;
import com.DTO.TiendaDeportivaVirtual.UsuarioVo;


public class UsuarioDao extends Conexion {
	public void registrarPersona(UsuarioVo Usuario) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("Insert into usuarios(cedula_usuario, nombre_usuario, email_usuario, usuario, contrasena) values (?,?,?,?,?)");
			sentencia.setLong(1, Usuario.getCedula_usuario());
			sentencia.setString(2, Usuario.getNombre_usuario());
			sentencia.setString(3, Usuario.getEmail_usuario());
			sentencia.setString(4, Usuario.getUsuario());
			sentencia.setString(5, Usuario.getContrasena());
			sentencia.executeUpdate();
			Desconectar();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void actualizarPersona(UsuarioVo Usuario) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("Update usuarios set nombre_usuario = ?, email_usuario = ?, usuario = ? , contrasena= ? where cedula_usuario = ?");
	
			sentencia.setString(1, Usuario.getNombre_usuario());
			sentencia.setString(2, Usuario.getEmail_usuario());
			sentencia.setString(3, Usuario.getUsuario());
			sentencia.setString(4, Usuario.getContrasena());
			sentencia.setLong(5, Usuario.getCedula_usuario());
			sentencia.executeUpdate();
			Desconectar();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void eliminarPersona(Long cedula_usuario) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("delete from usuarios where cedula_usuario = ?");
			sentencia.setLong(1, cedula_usuario);
			sentencia.executeUpdate();
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public UsuarioVo consultarPersona(Long cedula_usuario) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("select * from usuarios where cedula_usuario= ?");
			sentencia.setLong(1, cedula_usuario);
			ResultSet datos = sentencia.executeQuery();
			if (datos.next()) {
				UsuarioVo Usuario = new UsuarioVo();
				Usuario.setCedula_usuario(datos.getLong("cedula_usuario"));
				Usuario.setNombre_usuario(datos.getString("nombre_usuario"));
				Usuario.setEmail_usuario(datos.getString("email_usuario"));
				Usuario.setUsuario(datos.getString("usuario"));
				Usuario.setContrasena(datos.getString("contrasena"));
				return Usuario;
			}
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
		return null;
		
	}

	
	public boolean consulta(String usuario, String contrasena) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("select * from usuarios where usuario = ? and contrasena= ?");
			sentencia.setString(1, usuario);
			sentencia.setString(2, contrasena);
			ResultSet datos = sentencia.executeQuery();
			if (datos.next()) {
				return true;
			}else {
				return false;
			}
		}
		catch (Exception e) {
			System.out.println(e);
	     }
		return false;
       }
	
}


