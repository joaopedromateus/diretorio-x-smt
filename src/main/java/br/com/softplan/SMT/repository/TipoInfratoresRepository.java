package br.com.softplan.SMT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.softplan.SMT.entity.TipoInfratoresEntity;

@Repository
public interface TipoInfratoresRepository extends JpaRepository<TipoInfratoresEntity, Integer> {
	
	@Query(value = "SELECT a.id, a.descricao FROM TIPOINFRATORES a", nativeQuery = true)
	List<TipoInfratoresEntity> getListaTipoInfratores();

}
