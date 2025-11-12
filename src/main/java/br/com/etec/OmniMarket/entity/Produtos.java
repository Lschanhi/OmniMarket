package br.com.etec.OmniMarket.entity;

import br.com.etec.OmniMarket.enuns.CategoriaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@Entity(name = "TBL_PRODUTOS")
public class Produtos
{
    @Id
    @Column(name = "ID_PRODUTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "TX_DESCRICAO")
    private String descricao;
    @Column(name = "NR_VALOR_PRODUTO")
    private BigDecimal valorProduto;
    @Column(name = "NR_ESTOQUE")
    private Integer estoque;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;


    @Enumerated(EnumType.STRING)
    @Column(name = "TP_CATEGORIA")
    private CategoriaEnum categoria;

}
