package pe.edu.upeu.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.dao.detalle_pedidoDao;
import pe.edu.upeu.entity.detalle_pedido;
@Repository
public class detalle_pedidoDaoImpl implements detalle_pedidoDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from detalle_pedido";
		return jdbctemplate.queryForList(sql);
	}
	@Override
	public int create(detalle_pedido d) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(detalle_pedido d) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}