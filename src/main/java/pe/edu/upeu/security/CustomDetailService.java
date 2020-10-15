package pe.edu.upeu.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.usuarioDao;
import pe.edu.upeu.entity.usuario;


@Service
public class CustomDetailService implements UserDetailsService{
	@Autowired
	private usuarioDao usuariodao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		usuario user = usuariodao.read(username);
		if(user==null) {
			throw new UsernameNotFoundException(username);
		}
		return User.withUsername(user.getNomuser()).password(user.getClave()).authorities("USER").build();
	}
}