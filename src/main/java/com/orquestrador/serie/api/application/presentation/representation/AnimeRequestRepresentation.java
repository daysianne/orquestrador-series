package com.orquestrador.serie.api.application.presentation.representation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.orquestrador.serie.api.application.presentation.representation.enums.TipoGeneroRepresentation;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimeRequestRepresentation {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("autor")
    private String autor;

    @JsonProperty("anoPublicacao")
    private int anoPublicacao;

    @JsonProperty("numeroEpisodios")
    private int numeroEpisodios;

    @JsonProperty("sinopse")
    private String sinopse;

    @JsonProperty("tipoGenero")
    private TipoGeneroRepresentation tipoGenero;

}
