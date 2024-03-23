package com.anfic.rest.app_proyectos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anfic.rest.app_proyectos.domain.ProyectoInvestigacion;

import com.anfic.rest.app_proyectos.service.ProyectoInvestigacionService;

@RestController
@RequestMapping("/api/v1/proyectos")
public class ProyectoController {

	@Autowired
	private ProyectoInvestigacionService proyectoService;
	
	@GetMapping
	public List<ProyectoInvestigacion> listarProyectos(){
		return proyectoService.listartodos();
	}
	
	@GetMapping("/{id}")
	public ProyectoInvestigacion listarPorId(@PathVariable Long id) {
		return proyectoService.buscarPorId(id);
	}
	
	@PostMapping
	public ProyectoInvestigacion crearProyecto(@RequestBody ProyectoInvestigacion proyectoInvestigacion) {
		return proyectoService.grabar(proyectoInvestigacion);
	}
	
	@PutMapping("/{id}")
	public ProyectoInvestigacion editarProyecto(@PathVariable Long id, @RequestBody ProyectoInvestigacion proyectoInvestigacion) {
		ProyectoInvestigacion invBD=proyectoService.buscarPorId(id);
		invBD.setTitulo(proyectoInvestigacion.getTitulo());
		invBD.setFechaInicioPry(proyectoInvestigacion.getFechaInicioPry());
		invBD.setFechaCierrePry(proyectoInvestigacion.getFechaCierrePry());
		invBD.setPresupuestoPry(proyectoInvestigacion.getPresupuestoPry());
		invBD.setEstadoPry(proyectoInvestigacion.getEstadoPry());
		invBD.setResponsable(proyectoInvestigacion.getResponsable());
		return proyectoService.actualizar(proyectoInvestigacion, id);
	}
	@DeleteMapping("/{id}")
	public void eliminarProyecto(@PathVariable Long id) {
		proyectoService.eliminar(id);
	}
}
