package com.DAO.TiendaDeportivaVirtual;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.DTO.TiendaDeportivaVirtual.ClienteVo;

public class ClienteDao extends Conexion {
	public void registrarCliente(ClienteVo Cliente) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("insert into clientes(cedula_cliente, nombre_cliente, direccion_cliente, telefono_cliente, email_cliente) values (?,?,?,?,?)");
			sentencia.setLong(1, Cliente.getCedula_cliente());
			sentencia.setString(2, Cliente.getNombre_cliente());
			sentencia.setString(3, Cliente.getDireccion_cliente());
			sentencia.setString(4, Cliente.getTelefono_cliente());
			sentencia.setString(5, Cliente.getEmail_cliente());
			sentencia.executeUpdate();
			Desconectar();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void actualizarCliente(ClienteVo Cliente) {
		try {
			Conectar();
			PreparedStatement sentencia = Conexion.prepareStatement("update clientes set nombre_cliente = ?, direccion_cliente=?, telefono_cliente = ?, email_cliente = ? where cedula_cliente = ?");
			sentencia.setString(1, Cliente.getNombre_cliente());
			sentencia.setString(2, Cliente.getDireccion_cliente());
			sentencia.setString(3, Cliente.getTelefono_cliente());
			sentencia.setString(4, Cliente.getEmail_cliente());
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
			PreparedStatement sentencia = Conexion.prepareStatement("delete from clientes where cedula_cliente = ?");
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
				Cliente.setNombre_cliente(datos.getString("nombre_cliente"));
				Cliente.setDireccion_cliente(datos.getString("direccion_cliente"));
				Cliente.setTelefono_cliente(datos.getString("telefono_cliente"));
				Cliente.setEmail_cliente(datos.getString("email_cliente"));
				Desconectar();
				return Cliente;
			}else {
				ClienteVo Cliente = new ClienteVo();
				Cliente.setCedula_cliente(0);
				return null;
			}
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
}