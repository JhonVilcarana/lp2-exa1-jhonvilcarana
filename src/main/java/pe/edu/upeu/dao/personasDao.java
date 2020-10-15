package pe.edu.upeu.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.entity.personas;



public interface personasDao {
	int create(personas p);

	int update(personas p);

	int delete(int id);

	personas read(int id);

	List<Map<String, Object>> readAll();

}
