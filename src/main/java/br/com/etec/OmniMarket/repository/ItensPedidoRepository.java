package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.ItensPedido;
import br.com.etec.OmniMarket.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedidoRepository extends JpaRepository<ItensPedido, Integer>
{
}
