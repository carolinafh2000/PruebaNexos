package co.com.nexos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.nexos.model.entity.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Long> {

}
