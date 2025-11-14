package br.com.etec.OmniMarket.controller;

import br.com.etec.OmniMarket.entity.CarrinhoDeCompra;
import br.com.etec.OmniMarket.entity.Produtos;
import br.com.etec.OmniMarket.repository.CarrinhoDeCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CarrinhoCompra")
public class CarrinhoDeCompraController {

    @Autowired
    private CarrinhoDeCompraRepository ItensPedidoRepository;

    /*@PostMapping("/adicionar/{id}")
    public CarrinhoDeCompra adicionarProduto(@PathVariable Long id, @RequestBody Produtos p, int quantidade)
    {
        CarrinhoDeCompra carrinho = ItensPedidoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item não encontrado"));

        CarrinhoDeCompra novoItem = new CarrinhoDeCompra();
        novoItem.setProduto(p);
        novoItem.setQuantidade();

        carrinho.getItens().add(novoItem);
     */
    }

}