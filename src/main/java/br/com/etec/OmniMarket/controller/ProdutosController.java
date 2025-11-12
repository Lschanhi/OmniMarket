//GUSTAVO E FELIPE


package br.com.etec.OmniMarket.controller;

import br.com.etec.OmniMarket.entity.Produtos;
import br.com.etec.OmniMarket.entity.Usuario;
import br.com.etec.OmniMarket.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")

public class ProdutosController {

    @Autowired
    private ProdutosRepository produtoRepository;


    @GetMapping
    public List<Produtos> listarTodos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produtos buscarPorId(@PathVariable Long id) {
        Produtos produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return produto;
    }

    @PostMapping
    public Produtos cadastrarProduto(@RequestBody Produtos novoProduto) {
        return produtoRepository.save(novoProduto);
    }

    @PutMapping("/{id}")
    public Produtos atualizarProduto(@PathVariable Long id, @RequestBody Produtos produtoAtualizado) {
        Produtos produtoExistente = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        // Atualiza os campos desejados
        produtoExistente.setNome(produtoAtualizado.getNome());
        produtoExistente.setPreco(produtoAtualizado.getPreco());
        produtoExistente.setDescricao(produtoAtualizado.getDescricao());
        produtoExistente.setEstoque(produtoAtualizado.getEstoque());

        return produtoRepository.save(produtoExistente);
    }

    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Long id) {
        Produtos produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        produtoRepository.delete(produto);
        return "Produto com ID " + id + " foi excluído com sucesso!";
    }
}
