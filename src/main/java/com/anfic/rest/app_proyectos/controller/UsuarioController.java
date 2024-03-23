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


import com.anfic.rest.app_proyectos.domain.Usuario;
import com.anfic.rest.app_proyectos.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> listarUsuario(){
		return usuarioService.listartodos();
	}
	
	@GetMapping("/{id}")
	public Usuario listarPorId(@PathVariable Long id) {
		return usuarioService.buscarPorId(id);
	}
	
	@PostMapping
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioService.grabar(usuario);
	}
	
	@PutMapping("/{id}")
	public Usuario editarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
		Usuario invBD=usuarioService.buscarPorId(id);
		invBD.setEmail(usuario.getEmail());
		invBD.setRol(usuario.getRol());
		invBD.setPassword(usuario.getPassword());
		return usuarioService.actualizar(usuario, id);
	}
	@DeleteMapping("/{id}")
	public void eliminarUsuario(@PathVariable Long id) {
		usuarioService.eliminar(id);
	}
}
