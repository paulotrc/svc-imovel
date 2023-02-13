package br.paulotrc.svcimovel.transportlayers.dto.request;

import br.paulotrc.svcimovel.entites.enumerados.TipoRestricaoImovel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class ImovelRequest {

    private UUID id;
    private String cpf;
    private Boolean temRestricao;
    private TipoRestricaoImovel tipoRestricaoImovel;
    private BigDecimal valorRestricao;
}

