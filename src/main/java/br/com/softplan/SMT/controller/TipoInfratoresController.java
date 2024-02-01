package br.com.softplan.SMT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.softplan.SMT.entity.TipoInfratoresEntity;
import br.com.softplan.SMT.service.TipoInfratoresService;

@RestController
@RequestMapping("/api/tiposinfratores")
public class TipoInfratoresController {

    @Autowired
    private TipoInfratoresService tipoInfratoresService;

    @GetMapping("/lista")
    public List<TipoInfratoresEntity> obterListaTipoInfratores() {
        return tipoInfratoresService.getListaTipoInfratores();
    }
}