package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer>
{

}
