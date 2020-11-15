package nain.app.usuarios.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nain.app.usuarios.models.dao.UsuarioDao;
import nain.example.usuarios.commons.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

}
