package pe.edu.upeu.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.detalle_pedidoDao;
import pe.edu.upeu.service.detalle_pedidoService;
@Service
public class detalle_pedidoServiceImpl implements detalle_pedidoService {
	@Autowired
	private detalle_pedidoDao detallepedidodao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detallepedidodao.readAll();
	}

}