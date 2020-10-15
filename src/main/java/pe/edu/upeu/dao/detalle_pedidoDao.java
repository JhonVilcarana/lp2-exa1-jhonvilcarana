package pe.edu.upeu.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.entity.detalle_pedido;



public interface detalle_pedidoDao {
	int create(detalle_pedido d);
	int update(detalle_pedido d);
	int delete(int id);
	detalle_pedido read(int id);
	List<Map<String, Object>> readAll();

}
