package co.com.nexos.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table (name = "usuario", schema = "public")
@Getter
public class Usuarios {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String usuario;
	@Column
	private Integer edad;
	@Column
	private Integer id_cargo;
	@Column
	private Date fecha_ingreso_usu;
}
