package br.com.etec.OmniMarket.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario
{

    private int idUsuario;
    private String cpf;
    private String cnpj;
    private String nome;
    private String sobrenome;
    private String nomeFantasia;
    private String utilizador;
    private String senha;
    private String email;


}
