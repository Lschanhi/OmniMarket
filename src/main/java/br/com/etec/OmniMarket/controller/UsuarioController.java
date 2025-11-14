package br.com.etec.OmniMarket.controller;

import br.com.etec.OmniMarket.entity.Endereco;
import br.com.etec.OmniMarket.entity.Produtos;
import br.com.etec.OmniMarket.entity.Usuario;
import br.com.etec.OmniMarket.repository.EnderecoRepository;
import br.com.etec.OmniMarket.repository.ProdutosRepository;
import br.com.etec.OmniMarket.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController
{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ProdutosRepository produtoRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping
    public List<Usuario> listar()
    {
        return usuarioRepository.findAll();
    }
    public List<Produtos> listarProdutos()
    {
        return produtoRepository.findAll();
    }


    @GetMapping("/{id}/produtos")
    public List<Produtos> listarProdutos(@PathVariable Long id)
    {
       Usuario usuario = usuarioRepository.findById(id).orElseThrow(()-> new RuntimeException("Usuario Não Encontrado"));

     return produtoRepository.findByUsuario(usuario);

    }

    @PostMapping("/{id}/endereco")
    public Usuario adicionarEndereco(@PathVariable Long id, @RequestBody Endereco endereco) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        endereco.setUsuario(usuario);
        usuario.getEndereco().add(endereco);
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/editar/{id}")
    public Usuario alterarPerfil(@PathVariable Long id, @RequestBody Usuario usuarioAlterado)
    {
        Usuario usuarioExistente = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuarioExistente.setNome(usuarioAlterado.getNome());
        usuarioExistente.setSobrenome(usuarioAlterado.getSobrenome());
        usuarioExistente.setNomeFantasia(usuarioAlterado.getNomeFantasia());
        usuarioExistente.setEmail(usuarioAlterado.getEmail());
        usuarioExistente.setSenha(usuarioAlterado.getSenha());

        return usuarioRepository.save(usuarioExistente);

    }

@DeleteMapping("desativar/{id}")
    public  Usuario desativarPerfil(@PathVariable Long id)
{
    Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    return  usuarioRepository.deleteByUsuario(usuario);
}

}
