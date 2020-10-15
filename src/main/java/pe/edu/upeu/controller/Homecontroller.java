package pe.edu.upeu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.entity.usuario;
import pe.edu.upeu.security.JwtUtil;
import pe.edu.upeu.service.detalle_pedidoService;


@RestController
public class Homecontroller {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;
	@Autowired
		private detalle_pedidoService detalle_pedidoService;
	@GetMapping("/lista")
	public List<Map<String, Object>>listar(){
		return detalle_pedidoService.readAll();
		
	}
	
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenido Al sistema de ventas :)";
	}
	
	
	@PostMapping("/authenticate")
    public String generateToken(@RequestBody usuario authRequest) throws Exception {
        try {
        	System.out.println(authRequest.getNomuser());
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getNomuser(), authRequest.getClave()));
        } catch (Exception ex) {
            throw new Exception("Error: "+ex);
        }
return jwtUtil.generateToken(authRequest.getNomuser());
    }

}
