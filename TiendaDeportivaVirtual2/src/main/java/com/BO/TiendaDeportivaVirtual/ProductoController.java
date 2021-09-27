package com.BO.TiendaDeportivaVirtual;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.TiendaDeportivaVirtual.ProductoDao;
import com.DTO.TiendaDeportivaVirtual.ProductoVo;

@RestController
public class ProductoController {
	@RequestMapping("/recorrercsv")
	public void recorrercsv() {
		ProductoDao Dao= new ProductoDao();
		Dao.recorrercsv();
	}
	@RequestMapping("/examinarcsv")
	public boolean examinarcsv() throws IOException {
		ProductoDao Dao = new ProductoDao();
		return Dao.examinarcsv();
	}
	@RequestMapping("/leercsv")
	public List<ProductoVo> leer() {
		ProductoDao Dao = new ProductoDao();
		return Dao.leer();
	}
}
