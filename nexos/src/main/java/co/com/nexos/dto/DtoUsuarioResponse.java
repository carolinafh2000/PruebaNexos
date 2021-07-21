package co.com.nexos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DtoUsuarioResponse {
	 private Long id;
     private String nombre;
     private String usuario;
     private Integer edad;
     private DtoCargoResponse id_cargo;
}
