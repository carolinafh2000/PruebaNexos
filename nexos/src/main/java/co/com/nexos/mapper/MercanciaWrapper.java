package co.com.nexos.mapper;

import java.util.Optional;

import co.com.nexos.dto.DtoMercanciaResponse;
import co.com.nexos.dto.DtoProductoResponse;
import co.com.nexos.model.entity.Mercancias;
import co.com.nexos.model.entity.Productos;

public class MercanciaWrapper {

	public static DtoMercanciaResponse buildMercancia(Mercancias mercancia, Optional<Productos> producto) {
		DtoMercanciaResponse dtoMercancia = new DtoMercanciaResponse();
		dtoMercancia.setFecha_in(mercancia.getFecha_in());
		dtoMercancia.setFecha_mod(mercancia.getFecha_mod());
		dtoMercancia.setCantidad(mercancia.getCantidad());
		dtoMercancia.setProducto(DtoProductoResponse.builder().id(producto.get().getId()).descripcion(producto.get().getNombre_producto()).build());
		dtoMercancia.setUsuario_in(mercancia.getId_usuario_in());
		dtoMercancia.setUsuario_mod(mercancia.getId_usuario_mod());
		return dtoMercancia;
	}

}
