package br.paulotrc.svcimovel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SvcImovelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SvcImovelApplication.class, args);
    }

}
