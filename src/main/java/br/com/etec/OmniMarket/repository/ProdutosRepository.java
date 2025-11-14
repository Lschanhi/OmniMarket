package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.Produtos;
import br.com.etec.OmniMarket.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>
{
    List<Produtos> findByUsuario(Usuario usuario);

}
