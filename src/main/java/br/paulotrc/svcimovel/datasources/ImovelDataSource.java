package br.paulotrc.svcimovel.datasources;

import br.paulotrc.svcimovel.entites.Imovel;
import br.paulotrc.svcimovel.repositories.ImovelRepository;
import br.paulotrc.svcimovel.repositories.MongoImovelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelDataSource implements ImovelRepository {

    private final Logger log = LoggerFactory.getLogger(ImovelDataSource.class);
    private MongoImovelRepository mongoImovelRepository;

    public ImovelDataSource(MongoImovelRepository mongoImovelRepository) {
        this.mongoImovelRepository = mongoImovelRepository;
    }

    public Imovel save(Imovel imovel){
        return this.mongoImovelRepository.save(imovel);
    }

    public List<Imovel> findAll(){
        return this.mongoImovelRepository.findAll();
    }

    @Override
    public List<Imovel> consultarPorCpf(String cpf) {
        return mongoImovelRepository.consultarPorCpf(cpf);
    }

    @Override
    public List<Imovel> consultarPorCep(String cep) {
        return mongoImovelRepository.consultarPorCep(cep);
    }
}
