package br.com.etec.OmniMarket.entity;

import br.com.etec.OmniMarket.enuns.Categoria;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Produtos
{
    private Long idProduto;
    private String nome;
    private String descricao;
    private Double valorProduto;
    private Integer estoque;

    private Usuario usuario;
    private Categoria categoria;

}
