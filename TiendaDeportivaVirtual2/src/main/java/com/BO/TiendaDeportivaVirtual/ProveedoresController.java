package com.BO.TiendaDeportivaVirtual;

import org.springframework.web.bind.annotation.RequestMapping;

import com.DAO.TiendaDeportivaVirtual.proveedoresDao;
import com.DTO.TiendaDeportivaVirtual.ProveedorVo;

public class ProveedoresController {
	/*Registrar Usuarios*/
	@RequestMapping("/registrarUsuario")
	public void registrarProveedor(ProveedorVo Proveedor){
		proveedoresDao Dao =new proveedoresDao();
		Dao.registrarProveedor(Proveedor);
	}
	
	
	@RequestMapping("/actualizarUsuario")
	public void actualizarProveedor(ProveedorVo Proveedor){
		proveedoresDao Dao =new proveedoresDao();
		Dao.actualizarProveedor(Proveedor);
	}
	
	
	@RequestMapping("/eliminarUsuario")
	public void eliminarProveedor(Long Nit){
		proveedoresDao Dao =new proveedoresDao();
		Dao.eliminarProveedor(Nit);
	}
	
	@RequestMapping("/consultarUsuario")
	public ProveedorVo consultarProveedor(Long Nit){
		proveedoresDao Dao =new proveedoresDao();
		return Dao.consultarProveedor(Nit);
	}
}
