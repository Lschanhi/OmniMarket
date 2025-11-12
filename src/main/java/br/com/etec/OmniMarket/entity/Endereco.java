    package br.com.etec.OmniMarket.entity;

    import br.com.etec.OmniMarket.enuns.TipoLogradouroEnum;
    import br.com.etec.OmniMarket.enuns.TipoenderecoEnum;
    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.Setter;
    import org.hibernate.Length;

    @Getter
    @Setter
    @Entity(name = "TBL_ENDERECO")
    public class Endereco
    {
        @Id
        @Column(name = "ID_ENDERECO")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEndereco;
        @Column(name = "TX_CEP")
        private String cep;
        @Column(name = "TP_LOGRADOURO")
        @Enumerated(EnumType.STRING)
        private TipoLogradouroEnum logradouro;
        @Column(name = "TX_ENDERECO")
        private String endereco;
        @Column(name = "NR_NUMERO_ENDERECO")
        private int nrEndereco;
        @Column(name = "TX_BAIRRO")
        private String bairro;
        @Column(name = "TX_CIDADE")
        private String cidade;
        @Column(name = "TX_ESTADO")
        private String estado;
        @Column(name = "TX_UF")
        private String uf;
        @Column(name = "TX_COMPLEMENTO")
        private String complemento;
        @Column(name = "TP_ENDERECO")
        @Enumerated(EnumType.STRING)
        private TipoenderecoEnum tipoEndereco;

        @ManyToOne
        @JoinColumn(name = "ID_USUARIO")
        private Usuario usuario;

    }
