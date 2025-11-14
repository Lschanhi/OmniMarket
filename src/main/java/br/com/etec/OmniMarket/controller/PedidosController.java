package br.com.etec.OmniMarket.controller;

import br.com.etec.OmniMarket.entity.Pedidos;
import br.com.etec.OmniMarket.entity.Produtos;
import br.com.etec.OmniMarket.entity.Usuario;
import br.com.etec.OmniMarket.enuns.TipoStatusPedidoEnum;
import br.com.etec.OmniMarket.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/pedidos")

public class PedidosController {

    @Autowired
    private PedidosRepository pedidosRepository;

    @PutMapping("/atualizarStatus/{id}")
    public Pedidos atualizarStatus(@PathVariable Long id, @RequestBody TipoStatusPedidoEnum statusPedido)
    {
        Pedidos pedidoExistente = pedidosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        pedidoExistente.setTipoStatus(statusPedido);

        return pedidosRepository.save(pedidoExistente);
    }

    //precisa fazer
    /*/@PostMapping("/gerarPagamneto/{id}")
    public Pedidos gerarPagamento(@PathVariable Long id, @RequestBody BigDecimal pagamento)
    {

    }*/

    @GetMapping("/visualizar/{id}")
    public Pedidos visualizarDetalhe(@PathVariable Long id)
    {
        Pedidos pedido = pedidosRepository.findById(id).orElseThrow(()-> new RuntimeException("Pedido Não Encontrado"));

        return Pedidos.ToString;
    }
}
