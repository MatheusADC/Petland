package com.petland.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.petland.model.Cadastro;
import com.petland.model.Endereco;
import com.petland.model.Perfil;
import com.petland.repository.CadastroRepository;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private AnimalRepository repository;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Animal garfield = new Animal();
        garfield.setNome("Garfield");
        garfield.setAniversario(LocalDate.of(1978, 06, 19));
        garfield.setEspecie(AnimalEspecie.GATO);

        repository.save(garfield);
    }
}
