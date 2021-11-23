package classe;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Usuario usuario = (Usuario) objeto;
        return nome.equals(usuario.nome) && email.equals(usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
