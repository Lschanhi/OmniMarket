package br.com.etec.OmniMarket.repository;

import br.com.etec.OmniMarket.entity.Endereco;
import br.com.etec.OmniMarket.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>
{
}
