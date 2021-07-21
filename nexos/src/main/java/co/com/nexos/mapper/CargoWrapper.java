package co.com.nexos.mapper;


import co.com.nexos.dto.DtoCargoResponse;
import co.com.nexos.model.entity.Cargos;

public class CargoWrapper {

	public static DtoCargoResponse buildCargo(Cargos cargo) {
		DtoCargoResponse dtoCargo = new DtoCargoResponse();
		dtoCargo.setId(cargo.getId());
		dtoCargo.setDescripcion(cargo.getNombre_cargo());
		
		return dtoCargo;
		
	}

}