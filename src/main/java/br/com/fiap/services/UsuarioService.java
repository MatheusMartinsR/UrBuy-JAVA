package br.com.fiap.services;

import br.com.fiap.domain.entity.Usuario;

public class UsuarioService {

    public void inserirUsuario(Usuario usuario) {
        String email = usuario.getEmail();

        if (email != null) {
            // Lógica para inserir na tabela TB_USUARIO
            // Certifique-se de fornecer o e-mail ao inserir o usuário
        } else {
            // Trate o caso em que o e-mail é nulo
            System.out.println("Erro: O e-mail do usuário não pode ser nulo.");
        }
    }
}
