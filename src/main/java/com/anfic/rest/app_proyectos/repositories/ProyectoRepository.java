package com.anfic.rest.app_proyectos.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anfic.rest.app_proyectos.domain.ProyectoInvestigacion;

public interface ProyectoRepository extends JpaRepository<ProyectoInvestigacion, Long> {
	Optional<ProyectoInvestigacion> findByTitulo(String titulo);
	Optional<ProyectoInvestigacion> findByEstadoPry(String estadoPry);

}
