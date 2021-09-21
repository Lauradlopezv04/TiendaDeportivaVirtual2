package com.BO.TiendaDeportivaVirtual;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.TiendaDeportivaVirtual.ClienteDao;
import com.DTO.TiendaDeportivaVirtual.ClienteDao;

@RestController
public class ClientesController {
/*Registrar Clientes*/
	@RequestMapping("/registrarCliente")
	public void registrarCliente(ClienteDao Cliente){
		ClienteDao Dao=new ClienteDao();
		Dao.registrarCliente(Usuario);	
}

  @RequestMapping("/actualizarCliente")
	public void actualizarCliente(ClienteDao Cliente){
		ClienteDao Dao=new ClienteDao();
		Dao.actualizarCliente(Cliente);	
	}
	
	
	@RequestMapping("/eliminarCliente")
	public void eliminarCliente(Long cedula_Cliente){
		ClienteDao Dao= new ClienteDao();
		Dao.eliminarCliente(cedula_Cliente);
	}
	
	@RequestMapping("/consultarCliente")
	public UsuarioVo consultarCliente(Long cedula_Cliente){
		ClienteDao Dao= new ClienteDao();
		return Dao.consultarCliente(cedula_Cliente);
	}
	
	
}

