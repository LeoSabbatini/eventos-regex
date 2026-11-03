package com.validate.dto;

import jakarta.validation.constraints.*;

import java.util.Date;

public record EventoDTO(
        @NotBlank(message = "O nome é obrigatório")
        @Size(min = 5, max = 80, message = "O nome deve ter entre 5 e 80 caracteres")
        String nome,

        @NotNull(message = "O e-mail de contato é obrigatório")
        @Email(message = "O e-mail de contato deve ter um formato válido")
        String emailContato,

        @NotNull(message = "A data de início é obrigatória")
        @Future(message = "A data de início deve estar no futuro")
        Date dataInicio,

        @NotNull(message = "O número de vagas é obrigatório")
        @Min(value = 10, message = "O número mínimo de vagas é 10")
        @Max(value = 5000, message = "O número máximo de vagas é 5000")
        Integer vagas,

        @NotNull(message = "O preço do ingresso é obrigatório")
        @PositiveOrZero(message = "O preço do ingresso deve ser positivo ou zero")
        Double precoIngresso,

        @NotBlank(message = "O logradouro é obrigatório")
        String logradouro,

        @NotNull(message = "O número é obrigatório")
        Integer numero,

        @NotBlank(message = "O CEP é obrigatório")
        @Pattern(regexp = "^\\d{5}-\\d{3}$", message = "O CEP deve seguir o formato XXXXX-XXX")
        String CEP
) {
}
