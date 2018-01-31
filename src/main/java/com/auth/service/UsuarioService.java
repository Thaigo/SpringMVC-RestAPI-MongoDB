package com.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.entity.Usuario;
import com.auth.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> listaUsuario() {        

        return usuarioRepository.findAll();

    }

    public Usuario salvarUsuario(Usuario usuarioAdd) {    	

        return usuarioRepository.save(usuarioAdd);

    }
    
    public void deletarUsuario(String id) {
    	usuarioRepository.delete(id);
    }
    
    public Usuario consultarUsuario(String id) {
    	return usuarioRepository.findOne(id);
    }

}
