package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.ItensPedido;
import br.com.etec.OmniMarket.entity.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {

}
