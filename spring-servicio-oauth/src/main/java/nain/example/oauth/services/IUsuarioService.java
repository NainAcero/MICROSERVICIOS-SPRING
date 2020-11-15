package nain.example.oauth.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import nain.example.usuarios.commons.models.entity.Usuario;

public interface IUsuarioService extends UserDetailsService{
	
	public Usuario findByUsername(String username);
	
	public Usuario findByEmail(String username);
	
	public Usuario update(Usuario usuario,Long id);
	
}
