package nain.app.usuarios.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nain.app.usuarios.services.IUsuarioService;
import nain.example.usuarios.commons.models.entity.Role;
import nain.example.usuarios.commons.models.entity.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@PostMapping("/register")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario crear(@RequestBody Usuario usuario) {
		Role role = new Role();
		role.setId(Long.parseLong("1"));
		role.setNombre("ROLE_USER");
		
		List<Role> roles = new ArrayList<Role>();
		roles.add(role);

		usuario.setRoles(roles);
		return usuarioService.save(usuario);
	}
	
}
