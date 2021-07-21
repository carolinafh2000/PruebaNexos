package co.com.nexos.mapper;


import java.util.Optional;

import co.com.nexos.dto.DtoCargoResponse;
import co.com.nexos.dto.DtoUsuarioResponse;
import co.com.nexos.model.entity.Cargos;
import co.com.nexos.model.entity.Usuarios;

public class UsuarioWrapper {

	public static DtoUsuarioResponse buildUsuario(Usuarios usuario, Optional<Cargos> cargo) {
		DtoUsuarioResponse dtoUsuario = new DtoUsuarioResponse();
		dtoUsuario.setNombre(usuario.getNombre());
		dtoUsuario.setEdad(usuario.getEdad());
		dtoUsuario.setUsuario(usuario.getUsuario());
		dtoUsuario.setId_cargo(DtoCargoResponse.builder().id(cargo.get().getId()).descripcion(cargo.get().getNombre_cargo()).build());
		return dtoUsuario;
	}

}
