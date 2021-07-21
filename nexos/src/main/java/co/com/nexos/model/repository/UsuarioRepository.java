package co.com.nexos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.nexos.model.entity.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{

}
