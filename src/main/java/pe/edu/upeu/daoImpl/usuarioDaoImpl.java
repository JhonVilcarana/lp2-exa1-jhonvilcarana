package pe.edu.upeu.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.dao.usuarioDao;
import pe.edu.upeu.entity.usuario;

	@Repository

	public class usuarioDaoImpl implements usuarioDao {
		@Autowired
		private JdbcTemplate jdbctemplate;
		
		@Override
		public usuario read(String nomuser) {
			String sql = "select * from usuario where nomuser = ?";
			return jdbctemplate.queryForObject(sql, new Object[] {nomuser}, new BeanPropertyRowMapper<usuario>(usuario.class));
		}

	}