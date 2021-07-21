package co.com.nexos.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.nexos.dto.DtoCargoRequest;
import co.com.nexos.dto.DtoMercanciaRequest;
import co.com.nexos.dto.DtoUsuarioResponse;
import co.com.nexos.model.entity.Cargos;
import co.com.nexos.model.entity.Mercancias;

@RequestMapping("/v1/inventario")
public interface IPrueba extends IBaseController{
	
	@GetMapping(value="/cargos",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>testCargos();
	
	@GetMapping(value="/mercancias",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>testMercancias();
	
	@GetMapping(value="/usuarios",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>testUsuarios();
	
	@PostMapping(value="/registroMercancia", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>testRegistroMercancia(@RequestBody Mercancias mercancia);
	
	@PostMapping(value="/registroCargo", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>testRegistroCargo(@RequestBody Cargos cargo);

	@GetMapping(value="/mercanciaId/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>testMercanciasId(@PathVariable("id")Integer id);
	
	@PutMapping(value="/editarmercanciaId/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>testEditarMercancia(@RequestBody Mercancias mercancia, @PathVariable("id")Integer id);
	
	@DeleteMapping(value="/eliminarmercanciaId/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>testEliminarMercancia(@PathVariable("id")Integer id);
	
}
