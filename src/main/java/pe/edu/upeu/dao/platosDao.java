package pe.edu.upeu.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.entity.platos;



public interface platosDao {
	int create(platos pl);

	int update(platos pl);

	int delete(int id);

	platos read(int id);

	List<Map<String, Object>> readAll();

}
