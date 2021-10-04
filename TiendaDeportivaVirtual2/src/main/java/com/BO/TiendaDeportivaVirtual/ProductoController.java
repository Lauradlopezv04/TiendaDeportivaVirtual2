package com.BO.TiendaDeportivaVirtual;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.TiendaDeportivaVirtual.ProductoDao;
import com.DTO.TiendaDeportivaVirtual.ProductoVo;
@RestController
public class ProductoController {
	@RequestMapping("/recorrercsv")
	public void ListarProductos(ProductoVo producto){
		ProductoDao Dao= new ProductoDao();
		Dao.ListarProductos(producto);
	}
	@RequestMapping("/examinarcsv")
	public boolean examinarcsv(String archivo) throws IOException {
		ProductoDao Dao = new ProductoDao();
		return Dao.examinarcsv(archivo);
	}
}
