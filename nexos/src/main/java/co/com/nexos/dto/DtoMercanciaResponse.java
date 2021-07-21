package co.com.nexos.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DtoMercanciaResponse {
	private Date fecha_in;
	private Date fecha_mod;
	private Integer cantidad;
    private Integer usuario_in;
    private Integer usuario_mod;
    private DtoProductoResponse producto;
}
