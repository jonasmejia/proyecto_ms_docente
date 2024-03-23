package com.anfic.rest.app_proyectos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anfic.rest.app_proyectos.domain.AvanceProyecto;

public interface AvanceRepository extends JpaRepository<AvanceProyecto, Long> {

}
