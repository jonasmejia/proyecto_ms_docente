package com.anfic.rest.app_proyectos.service;

import java.util.List;

import com.anfic.rest.app_proyectos.domain.ProyectoInvestigacion;

public interface ProyectoInvestigacionService {
	List<ProyectoInvestigacion> listartodos();
	ProyectoInvestigacion buscarPorId(Long id);
	ProyectoInvestigacion grabar(ProyectoInvestigacion proyectoInvestigacion);
	ProyectoInvestigacion actualizar(ProyectoInvestigacion proyectoInvestigacion, long id);
	void eliminar(Long id);
	ProyectoInvestigacion findByTitulo(String titulo);
	ProyectoInvestigacion findByEstadoPry(String estadoPry);
}
