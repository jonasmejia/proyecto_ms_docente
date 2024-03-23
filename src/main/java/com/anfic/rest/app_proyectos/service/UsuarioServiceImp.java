package com.anfic.rest.app_proyectos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anfic.rest.app_proyectos.domain.Usuario;
import com.anfic.rest.app_proyectos.repositories.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepository invRep;
	
	@Override
	@Transactional
	public List<Usuario> listartodos() {
		return invRep.findAll();
	}

	@Override
	@Transactional
	public Usuario buscarPorId(Long id) {
		Optional<Usuario> usuario=invRep.findById(id);
		return usuario.get();
	}

	@Override
	@Transactional
	public Usuario grabar(Usuario usuario) {
		return invRep.save(usuario);
	}

	@Override
	@Transactional
	public Usuario actualizar(Usuario usuario, long id) {
		usuario.setId(id);
		return invRep.save(usuario);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		invRep.deleteById(id);
	}

	@Override
	@Transactional
	public Usuario findByEmail(String email) {
		Optional<Usuario> inv=invRep.findByEmail(email);
		return inv.get();
	}

}
