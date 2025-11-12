package br.com.etec.OmniMarket.entity;

import br.com.etec.OmniMarket.enuns.TipoStatusPedidoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "TBL_PEDIDOS")
public class Pedidos {
    @Id
    @Column(name = "ID_PEDIDO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TP_ENTREGA")
    private Double tipoEntrega;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_STATUS_PEDIDO")
    private TipoStatusPedidoEnum tipoStatusPedido;
    @Column(name = "NR_VALOR_TOTAL_PEDIDO")
    private BigDecimal valorTotal;
    @Column(name = "NR_RASTREIO")
    private Integer rastreio;

    @ManyToOne
    @Column(name = "ID_CARRINHO")
    private CarrinhoDeCompra carrinho;

    @OneToOne
    @Column(name = "ID_PAGAMENTO")
    private Pagamento pagamento;

    public void AtualizarStatus(TipoStatusPedidoEnum status)
    {

    }

    public void GerarPagamento()
    {

    }

    public void VisualizarDetalhes()
    {

    }
}
