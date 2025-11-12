package br.com.etec.OmniMarket.entity;

import br.com.etec.OmniMarket.enuns.FormaPagamentoEnum;
import br.com.etec.OmniMarket.enuns.TipoStatusPagamentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "TBL_PAGAMENTO")
public class Pagamento {
    @Id
    @Column(name = "ID_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_STATUS_PAGAMENTO")
    private TipoStatusPagamentoEnum tipoStatusPagamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_FORMA_PAGAMENTO")
    private FormaPagamentoEnum formaPagamento;

    @Column(name = "NR_FORMA_PAGAMENTO")
    private Integer nrFormaPagamento;


    public void Realizarpagamento()
    {

    }

    public void AtualizarStatus(TipoStatusPagamentoEnum status)
    {

    }
}
