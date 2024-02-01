package br.com.softplan.SMT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.softplan.SMT.entity.TipoInfratoresEntity;
import br.com.softplan.SMT.repository.TipoInfratoresRepository;

@Service
public class TipoInfratoresService {
	
	@Autowired
	private TipoInfratoresRepository tipoInfratoresRepository;

	public List<TipoInfratoresEntity> getListaTipoInfratores() {
		List<TipoInfratoresEntity> listaTipoInfratores = tipoInfratoresRepository.getListaTipoInfratores();
		return listaTipoInfratores;
	}
	
}
