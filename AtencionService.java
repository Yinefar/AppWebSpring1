package com.AppWebSpring1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.AppWebSpring1.model.Atencion;
import com.AppWebSpring1.model.Tipo;
import com.AppWebSpring1.repository.IAtencionRepository;
import com.AppWebSpring1.repository.ITipoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AtencionService {
	
	private final ITipoRepository repoTipo;
	private final IAtencionRepository repoAten;
	
	public List<Tipo> listaTipos() {
	return repoTipo.findAll();
		}
	
	public List<Atencion> listaAtenciones() {
	return repoAten.findAll();
	}

	public Atencion grabarAtencion(Atencion at) {
		return repoAten.save(at); 
	}

}
