package br.com.etec.OmniMarket.controller;

import br.com.etec.OmniMarket.entity.ItensPedido;
import br.com.etec.OmniMarket.entity.Produtos;
import br.com.etec.OmniMarket.repository.ItensPedidoRepository;
import br.com.etec.OmniMarket.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/itensPedido")

public class ItensPedidoController
{
    @Autowired
    private ItensPedidoRepository ItensPedidoRepository;

    /*@PostMapping("/calcular/{id}")
    public ItensPedido calcularSubTotal(@PathVariable Long id, @RequestBody int quantidade, int valorUnitario)
    {
        ItensPedido itemExistente = ItensPedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item não encontrado"));

        if (ItensPedido.getQuatidade <= 0)
        {
            return "Não há produtos para calcular o subtotal";
        }

        ItensPedido.getSubTotal(ItensPedido.setSubTotal() = quantidade * valorUnitario);
        return "O seu subtotal deu: R$" + ItensPedido.getSubTotal;
    }*/

}
