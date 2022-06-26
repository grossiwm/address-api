package br.edu.infnet.apiendereco.loader;

import br.edu.infnet.apiendereco.model.domain.Endereco;
import br.edu.infnet.apiendereco.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EnderecoLoader implements ApplicationRunner {

    @Autowired
    private EnderecoService enderecoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	
    	try {
    		
    		enderecoService.excluiTudo();

	        Endereco endereco0 = new Endereco();
	        Endereco endereco1 = new Endereco();

        
            endereco0.setBairro("Ingá");
            endereco0.setComplemento("108");
            endereco0.setCep("24210‑500");
            endereco0.setLocalidade("Niterói");
            endereco0.setLogradouro("Rua Almir Guimarães");
            endereco0.setUf("RJ");
            
            endereco1.setBairro("Ingá");
            endereco1.setComplemento("220");
            endereco1.setCep("24210‑500");
            endereco1.setLocalidade("Niterói");
            endereco1.setLogradouro("Rua Almir Guimarães");
            endereco1.setUf("RJ");
            
            
            enderecoService.incluir(endereco0);
            enderecoService.incluir(endereco1);
            

        } catch (Exception e){
        	e.printStackTrace();
        }

    }
}
