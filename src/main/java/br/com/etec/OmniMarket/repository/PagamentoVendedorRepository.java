package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.PagamentoVendedor;
import br.com.etec.OmniMarket.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoVendedorRepository extends JpaRepository<PagamentoVendedor, Integer>
{
}
