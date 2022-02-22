package com.atlantico.feigndemo.data;

import lombok.Data;

@Data
public class CepResponseDTO {

    private String logradouro;

    private String localidade;

    private String uf;

    private String bairro;

    private String complemento;

}
