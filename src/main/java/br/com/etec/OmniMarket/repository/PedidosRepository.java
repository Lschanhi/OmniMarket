package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.Pedidos;
import br.com.etec.OmniMarket.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Integer>
{
    List<Pedidos> findByIdUsuario(Integer idUsuario);
}
