package com.petland.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.petland.model.Cadastro;
import com.petland.repository.CadastroRepository;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private CadastroRepository repository;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cadastro matheus = new Cadastro();
        matheus.setId(2);
        matheus.setNome("Matheus");
        repository.save(matheus);
    }
}
