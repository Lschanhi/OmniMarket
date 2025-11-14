package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{

    Usuario deleteByUsuario(Usuario usuario);
}
