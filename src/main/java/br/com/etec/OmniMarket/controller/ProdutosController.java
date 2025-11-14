//GUSTAVO E FELIPE


package br.com.etec.OmniMarket.controller;

import br.com.etec.OmniMarket.entity.Produtos;
import br.com.etec.OmniMarket.entity.Usuario;
import br.com.etec.OmniMarket.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")

public class ProdutosController {

    @Autowired
    private ProdutosRepository produtoRepository;



    @PostMapping
    public Produtos cadastrarProduto(@RequestBody Produtos novoProduto) {
        return produtoRepository.save(novoProduto);
    }

    @PutMapping("/{id}")
    public Produtos atualizarValorProduto(@PathVariable Long id, @RequestBody Produtos produtoAtualizado)
    {
        Produtos produtoExistente = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        // Atualiza os campos desejados

        produtoExistente.setValorProduto(produtoAtualizado.getValorProduto());

        return produtoRepository.save(produtoExistente);
    }

    @PutMapping("/reduzir/{id}")
    public String reduzirEstoque(@PathVariable Long id, @RequestBody Integer quantidade)
    {
        Produtos produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        if (produto.getEstoque() < quantidade) {
            return "Não há estoque suficiente para reduzir";
        }

        // Reduz o estoque
        produto.setEstoque(produto.getEstoque() - quantidade);

        // Salva a alteração no banco
        produtoRepository.save(produto);

        return "Estoque do produto com ID " + id + " foi reduzido em " + quantidade + " unidade(s). Estoque atual: " + produto.getEstoque();
    }


    @PutMapping("/aumentar/{id}")
    public String aumentarEstoque(@PathVariable Long id, @RequestBody Integer quantidade)
    {
        Produtos produto = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produto.setEstoque(produto.getEstoque() + quantidade);

        return "Estoque do produto com ID " + id + " foi aumentado em " + quantidade + " unidade(s). Estoque atual: " + produto.getEstoque();
    }
}
