package co.com.nexos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.nexos.dto.DtoCargoRequest;
import co.com.nexos.dto.DtoCargoResponse;
import co.com.nexos.dto.DtoMercanciaRequest;
import co.com.nexos.dto.DtoMercanciaResponse;
import co.com.nexos.dto.DtoUsuarioResponse;
import co.com.nexos.mapper.CargoWrapper;
import co.com.nexos.mapper.MercanciaWrapper;
import co.com.nexos.mapper.UsuarioWrapper;
import co.com.nexos.model.entity.Cargos;
import co.com.nexos.model.entity.Mercancias;
import co.com.nexos.model.entity.Usuarios;
import co.com.nexos.model.repository.CargoRepository;
import co.com.nexos.model.repository.MercanciaRepository;
import co.com.nexos.model.repository.UsuarioRepository;
import co.com.nexos.model.repository.ProductoRepository;
import co.com.nexos.service.IPruebaService;

@Service
public class PruebaServiceImpl implements IPruebaService {

	private final CargoRepository cargoRepository;
	private final MercanciaRepository mercanciaRepository;
	private final UsuarioRepository usuarioRepository;
	private final ProductoRepository productoRepository;

	@Autowired
	public PruebaServiceImpl(CargoRepository _cargoRepository, MercanciaRepository _mercanciaRepository, UsuarioRepository _usuarioRepository, ProductoRepository _productoRepository) {
		this.cargoRepository = _cargoRepository;
		this.productoRepository = _productoRepository;
		this.mercanciaRepository = _mercanciaRepository;
		this.usuarioRepository = _usuarioRepository;
	}

	@Override
	public List<DtoCargoResponse> testCargosService() {
		List<Cargos> cargos = cargoRepository.findAll();
		List<DtoCargoResponse> dtoCargo = new ArrayList<>();
		for(Cargos cargo :cargos) {
			dtoCargo.add(CargoWrapper.buildCargo(cargo));
		}
		return dtoCargo;
	}

	@Override
	public List<DtoMercanciaResponse> testMercanciasService() {
		List<Mercancias> mercancias = mercanciaRepository.findAll();
		List<DtoMercanciaResponse> dtoMercancia = new ArrayList<>();
		for(Mercancias mercancia :mercancias) {
			dtoMercancia.add(MercanciaWrapper.buildMercancia(mercancia, productoRepository.findById(Long.parseLong(mercancia.getId_producto()+""))));
		}
		return dtoMercancia;
	}

	@Override
	public List<DtoUsuarioResponse> testUsuariosService() {
		 List<Usuarios> usuarios= usuarioRepository.findAll();
		 List<DtoUsuarioResponse> dtoUsuario = new ArrayList<>();
		for(Usuarios usuario :usuarios){
			dtoUsuario.add(UsuarioWrapper.buildUsuario(usuario, cargoRepository.findById(Long.parseLong(usuario.getId_cargo()+""))));
		}
		return dtoUsuario;
	}

	@Override
	public String testRegistroMercanciaService(Mercancias mercancia) {
		mercanciaRepository.save(mercancia);
		return "Registro de cargo exitoso";
	}

	@Override
	public String testRegistroCargoService(Cargos cargo) {
		cargoRepository.save(cargo);
		return "Registro de cargo exitoso";
	}

	@Override
	public List<DtoMercanciaResponse> testMercanciasIdService(Integer id) {
		List<Mercancias> mercancias = mercanciaRepository.findAll();
		List<DtoMercanciaResponse> dtoMercancia = new ArrayList<>();
		for(Mercancias mercancia :mercancias) {
			dtoMercancia.add(MercanciaWrapper.buildMercancia(mercancia, productoRepository.findById(Long.parseLong(mercancia.getId_producto()+""))));
		}
		return dtoMercancia;
	}

	@Override
	public String  testEditarMercanciaService(Mercancias mercancia, Integer id) {
		mercanciaRepository.save(mercancia);
		return "Registro de cargo exitoso";
	}

	@Override
	public String testEliminarMercanciaService(Integer id) {
		mercanciaRepository.delete(null);
		return "Eliminación exitosa";
	}


	
	
}
