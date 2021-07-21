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

public class DtoMercanciaRequest {
	private Date fecha_in;
	private Integer cantidad;
    private Integer usuario_in;
    private Integer id_producto;
}
