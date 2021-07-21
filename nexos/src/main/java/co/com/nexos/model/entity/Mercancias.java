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
@Table (name = "mercancia", schema = "public")
@Getter
public class Mercancias {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Date fecha_in;
	@Column
	private Integer cantidad;
	@Column
	private Integer id_usuario_in;
	@Column
	private Integer id_usuario_mod;
	@Column
	private Date fecha_mod;
	@Column
	private Integer id_producto;
}
