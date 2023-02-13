package br.paulotrc.svcimovel.entites;

import br.paulotrc.svcimovel.entites.enumerados.TipoRestricaoImovel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@Document //Anotação mongo para mapeamento do document.
public class Imovel {

    @Id
    private UUID id = UUID.randomUUID();
    private String cpf;
    private Boolean temRestricao;
    private TipoRestricaoImovel tipoRestricaoImovel;
    private BigDecimal valorRestricao;
}

