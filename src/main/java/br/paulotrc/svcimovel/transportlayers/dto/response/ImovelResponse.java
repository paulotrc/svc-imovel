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

    private UUID id = UUID.randomUUID();
    private String cpf; //Documento de identificação do dono do imóvel
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String endereco;
    private String numero;
    private String complemento;
    private String referencia;
}

