package com.petland.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.petland.cadastros.repository.AnimalRepository;
import com.petland.cadastros.repository.CadastroRepository;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private CadastroRepository cadastroRepository;

    @Autowired
    private AnimalRepository animalRepository;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
