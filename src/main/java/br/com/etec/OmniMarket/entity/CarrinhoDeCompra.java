package br.com.etec.OmniMarket.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "TBL_CARRINHO_COMPRA")
public class CarrinhoDeCompra {
    @Id
    @Column (name = "ID_CARRINHO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany
    @JoinColumn(name = "ID_ITENS_PRODUTOS")
    private ItensCarrinho itensCarrinho;

    @OneToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;
}
