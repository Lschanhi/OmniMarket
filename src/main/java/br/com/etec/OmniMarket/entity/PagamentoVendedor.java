package br.com.etec.OmniMarket.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "TBL_PAGAAMENTO_VENDEDOR")
public class PagamentoVendedor {
    @Id
    @Column(name = "ID_PAGAMENTO_VENDEDOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NR_VALOR")
    private BigDecimal valor;
    @Column(name = "DT_PAGAMENTO")
    private LocalDateTime dataPagamento;

    @OneToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "ID_PAGAMENTO")
    private Pagamento pagamento;

}
