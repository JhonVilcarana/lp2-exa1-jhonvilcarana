package pe.edu.upeu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.dao.detalle_pedidoDao;

@SpringBootTest
class Lp2Exa1JhonvilcaranaApplicationTests {

	@Autowired
	private detalle_pedidoDao detalle;
	@Test
	void contextLoads() {
		System.out.println(detalle.readAll());
	}

}