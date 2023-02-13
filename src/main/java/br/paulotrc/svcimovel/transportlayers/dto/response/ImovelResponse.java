package br.paulotrc.svcimovel.transportlayers.dto.response;

import br.paulotrc.svcimovel.entites.enumerados.TipoRestricaoImovel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class ImovelResponse {

    private UUID id;
    private String cpf;
    private Boolean temRestricao;
    private TipoRestricaoImovel tipoRestricaoImovel;
    private BigDecimal valorRestricao;
}

