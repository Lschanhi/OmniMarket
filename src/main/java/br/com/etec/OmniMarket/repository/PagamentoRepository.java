package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.Pagamento;
import br.com.etec.OmniMarket.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>
{
}
