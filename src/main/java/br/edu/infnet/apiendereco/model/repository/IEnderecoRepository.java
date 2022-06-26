package br.edu.infnet.apiendereco.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiendereco.model.domain.Endereco;

@Repository
public interface IEnderecoRepository extends CrudRepository<Endereco, Integer> {

    List<Endereco> findByCep(String cep);

}
