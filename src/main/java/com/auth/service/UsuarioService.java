package com.auth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.auth.entity.Usuario;

@Service
public class UsuarioService {
	public List<Usuario> listaUsuario() {

        List<Usuario> usuarioLista = new ArrayList<>();

        Usuario usuario = new Usuario();

        usuario.setEmail("maria@gmail.com");
        usuario.setIdade(26);
        usuario.setNome("Maria");

        usuarioLista.add(usuario);

        usuario = new Usuario();

        usuario.setEmail("fulano@gmail.com");
        usuario.setIdade(35);
        usuario.setNome("Fulano de tal");

        usuarioLista.add(usuario);

        return usuarioLista;

    }

    public List<Usuario> listaUsuario(Usuario usuarioAdd) {

        List<Usuario> usuarioLista = this.listaUsuario();
        usuarioLista.add(usuarioAdd);

        return usuarioLista;

    }

}
