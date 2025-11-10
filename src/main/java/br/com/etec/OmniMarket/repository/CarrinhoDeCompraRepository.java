package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.CarrinhoDeCompra;
import br.com.etec.OmniMarket.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoDeCompraRepository extends JpaRepository<CarrinhoDeCompra, Integer>
{
}
