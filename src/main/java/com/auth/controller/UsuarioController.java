package com.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auth.entity.Usuario;
import com.auth.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public List<Usuario> listUsuario() {
        return this.usuarioService.listaUsuario();
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.salvarUsuario(usuario);
    }
    
    @RequestMapping(value = "/usuario", method = RequestMethod.PUT)
    public Usuario editarUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.salvarUsuario(usuario);
    }
    
    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
    public void deletarUsuario(@PathVariable String id) {
        this.usuarioService.deletarUsuario(id);
    }
    
    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
    public Usuario consultarUsuario(@PathVariable String id) {
        return this.usuarioService.consultarUsuario(id);
    }

}
