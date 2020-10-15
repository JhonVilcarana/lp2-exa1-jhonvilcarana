package pe.edu.upeu.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.entity.pedidos;



public interface pedidosDao {
	int create(pedidos pe);

	int update(pedidos pe);

	int delete(int id);

	pedidos  read(String nomuser);

	List<Map<String, Object>> readAll();
}



