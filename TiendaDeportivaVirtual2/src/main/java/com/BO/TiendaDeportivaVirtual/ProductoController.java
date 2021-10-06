package com.BO.TiendaDeportivaVirtual;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.TiendaDeportivaVirtual.ProductoDao;
@RestController
public class ProductoController {
	@RequestMapping("/recorrercsv")
	public void recorrercsv(String archivo){
		ProductoDao Dao= new ProductoDao();
		Dao.recorrercsv(archivo);
	}
	@RequestMapping("/examinarcsv")
	public boolean examinarcsv(String archivo) throws IOException {
		ProductoDao Dao = new ProductoDao();
		return Dao.examinarcsv(archivo);
	}
}
