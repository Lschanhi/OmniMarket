package br.com.etec.OmniMarket.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity(name = "TBL_USUARIO")
public class Usuario
{

    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(name = "NR_CPF")
    private String cpf;
    @Column(name = "NR_CNPJ")
    private String cnpj;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "TX_SOBRENOME")
    private String sobrenome;
    @Column(name = "TX_NOME_FANTASIA")
    private String nomeFantasia;
    @Column(name = "TX_NOME_UTILIZADOR")
    private String utilizador;
    @Column(name = "TX_SENHA")
    private String senha;
    @Column(name = "TX_EMAIL")
    private String email;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Endereco> endereco = new ArrayList<>();
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Produtos> produtos = new ArrayList<>();


    public void ConsultarProdutos()
    {

    }

    public void ConsultarVendas()
    {

    }

    public void CadastrarUsuario()
    {

    }

    public void AtualizarPerfil()
    {

    }

    public void AdicionarEndereco(Endereco endereco)
    {

    }

}
