package br.paulotrc.svcimovel.transportlayers;

import br.paulotrc.svcimovel.transportlayers.dto.request.ImovelRequest;
import br.paulotrc.svcimovel.transportlayers.dto.response.ImovelResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Tag(name = "Imovel", description = "Operações com Imovel")
@RequestMapping(value = "/api/v1")
public interface ImovelResourceI {

    @Operation(summary = "Obter as restrições do Imovel de um cliente pelo seu cpf")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Restrição encontrada",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ImovelRequest.class))}),
            @ApiResponse(responseCode = "400", description = "Restrição não encontrada",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),
            @ApiResponse(responseCode = "500", description = "Erro interno",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),
            @ApiResponse(responseCode = "501", description = "Ainda não implementado",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),

    })
    @GetMapping (value = "/imovel/{cpf}", produces = {MediaType.APPLICATION_JSON_VALUE})
    @Valid
    ResponseEntity<List<ImovelResponse>> get(
            @Parameter(name = "cpf", description = "Número do CPF do Cliente", required = true)
            @PathVariable("cpf") String cpf
    );

    @Operation(summary = "Obter todas as restriçoes do cliente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Restrições encontradas",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ImovelRequest.class))}),
            @ApiResponse(responseCode = "400", description = "Restrições não encontradas",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),
            @ApiResponse(responseCode = "500", description = "Erro interno",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),
            @ApiResponse(responseCode = "501", description = "Ainda não implementado",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),

    })
    @GetMapping (value = "/imovel/all", produces = {MediaType.APPLICATION_JSON_VALUE})
    @Valid
    ResponseEntity<List<ImovelResponse>> getAll();

    @Operation(summary = "Salvar os dados de uma restrição de um cliente para o Imovel")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Restrição cadastrada",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ImovelResponse.class))}),
            @ApiResponse(responseCode = "500", description = "Erro interno",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),
            @ApiResponse(responseCode = "501", description = "Ainda não implementado",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),

    })
    @PostMapping (value = "/imovel", produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<ImovelResponse> post(@Valid @RequestBody ImovelRequest imovelRequest);

}
