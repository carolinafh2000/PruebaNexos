package co.com.nexos.service;

import java.util.List;

import co.com.nexos.dto.DtoCargoRequest;
import co.com.nexos.dto.DtoCargoResponse;
import co.com.nexos.dto.DtoMercanciaRequest;
import co.com.nexos.dto.DtoMercanciaResponse;
import co.com.nexos.dto.DtoUsuarioResponse;
import co.com.nexos.model.entity.Cargos;
import co.com.nexos.model.entity.Mercancias;
import co.com.nexos.model.entity.Usuarios;

public interface IPruebaService {
	
	List<DtoCargoResponse> testCargosService();
	List<DtoMercanciaResponse> testMercanciasService();
	List<DtoUsuarioResponse> testUsuariosService();
	String testRegistroCargoService(Cargos cargo);
	String testRegistroMercanciaService(Mercancias mercancia);
	List<DtoMercanciaResponse> testMercanciasIdService(Integer id);
	String  testEditarMercanciaService(Mercancias mercancia, Integer id);
	Object testEliminarMercanciaService(Integer id);
}
