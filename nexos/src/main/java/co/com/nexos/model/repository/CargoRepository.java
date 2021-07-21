package co.com.nexos.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.nexos.model.entity.Cargos;

@Repository
public interface CargoRepository extends JpaRepository<Cargos, Long>{

}
