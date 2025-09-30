package com.javanauta.cadastro_usuario.business;

import org.springframework.stereotype.Service;

import com.javanauta.cadastro_usuario.infrastructure.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void salvarUsuario()
}
