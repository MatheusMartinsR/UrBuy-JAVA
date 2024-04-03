package br.com.fiap.services;

import br.com.fiap.domain.entity.Usuario;

public class UsuarioService {

    public void inserirUsuario(Usuario usuario) {
        String email = usuario.getEmail();

        if (email != null) {

        } else {

            System.out.println("Erro: O e-mail do usuário não pode ser nulo.");
        }
    }
}
