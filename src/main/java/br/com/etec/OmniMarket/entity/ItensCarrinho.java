package br.com.etec.OmniMarket.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "TBL_ITENS_CARRINHO")
public class ItensCarrinho {
    @Id
    @Column(name = "ID_ITENS_CARRINHO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "QTD_PRODUTO")
    private Long qtdProdutos;
    @Column(name = "VALOR_TOTAL_PRODUTO")
    private BigDecimal valorTotal;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO")
    private Produtos produto;

}
