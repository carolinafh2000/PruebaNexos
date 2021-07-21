package co.com.nexos.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import co.com.nexos.controller.IPrueba;
import co.com.nexos.dto.DtoCargoRequest;
import co.com.nexos.dto.DtoMercanciaRequest;
import co.com.nexos.dto.DtoUsuarioResponse;
import co.com.nexos.model.entity.Cargos;
import co.com.nexos.model.entity.Mercancias;
import co.com.nexos.service.IPruebaService;

@RestController
public class PruebaImpl implements IPrueba {

	private final IPruebaService pruebaService;

	@Autowired
	public PruebaImpl(IPruebaService _pruebaService) {
		this.pruebaService = _pruebaService;
	}

	@Override
	public ResponseEntity<?> testCargos() {
		return basicResponse(pruebaService.testCargosService());
	}

	@Override
	public ResponseEntity<?> testMercancias() {
		return basicResponse(pruebaService.testMercanciasService());
	}

	@Override
	public ResponseEntity<?> testUsuarios() {
		return basicResponse(pruebaService.testUsuariosService());
	}

	@Override
	public ResponseEntity<?> testRegistroMercancia(Mercancias mercancia) {
		return basicResponse(pruebaService.testRegistroMercanciaService(mercancia));
	}

	@Override
	public ResponseEntity<?> testRegistroCargo(Cargos cargo) {
		return basicResponse(pruebaService.testRegistroCargoService(cargo));
	}

	@Override
	public ResponseEntity<?> testMercanciasId(Integer id) {
		return basicResponse(pruebaService.testMercanciasIdService(id));
	}

	@Override
	public ResponseEntity<?> testEditarMercancia(Mercancias mercancia, Integer id) {
		return basicResponse(pruebaService.testEditarMercanciaService(mercancia, id));
	}

	@Override
	public ResponseEntity<?> testEliminarMercancia(Integer id) {
		return basicResponse(pruebaService.testEliminarMercanciaService(id));
	}

}
