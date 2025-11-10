package br.com.etec.OmniMarket.controller;

import br.com.etec.OmniMarket.entity.Endereco;
import br.com.etec.OmniMarket.entity.Produtos;
import br.com.etec.OmniMarket.entity.Usuario;
import br.com.etec.OmniMarket.repository.ProdutoRepository;
import br.com.etec.OmniMarket.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController
{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Usuario> Listar()
    {
        return usuarioRepository.findAll();
    }
    public List<Produtos> ListarProdutos()
    {
        return produtoRepository.findAll();
    }
    @PostMapping("/{id}/produtos")
    public Produtos CadastrarProdutos(@PathVariable Integer id, @RequestBody Produtos produto)
    {
       Usuario usuario = usuarioRepository.findById(id).orElseThrow(()-> new RuntimeException("Usuario Não Encontrado"));

        produto.setUsuario(usuario);

        return produtoRepository.save(produto);
    }

    @PostMapping("/{id}/endereco")
    public Usuario adicionarEndereco(@PathVariable int id, @RequestBody Endereco endereco) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        endereco.setUsuario(usuario);
        usuario.getEnderecos().add(endereco);
        return usuarioRepository.save(usuario);
    }
}
