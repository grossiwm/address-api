package br.edu.infnet.apiendereco.model.service;

import br.edu.infnet.apiendereco.model.domain.Endereco;
import br.edu.infnet.apiendereco.model.repository.IEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private IEnderecoRepository iEnderecoRepository;

    public List<Endereco> obterLista(){
        return (List<Endereco>) iEnderecoRepository.findAll();
    }

    public void incluir(Endereco endereco){
        iEnderecoRepository.save(endereco);
    }

    public void excluir(Integer id){
        iEnderecoRepository.deleteById(id);
    }
    
    public void excluiTudo() {
    	iEnderecoRepository.deleteAll();
    }
    
    public List<Endereco> obterPorCep(String cep){
        return iEnderecoRepository.findByCep(cep);
    }

}
