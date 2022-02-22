package com.atlantico.feigndemo.data;

import lombok.Data;

@Data
public class CepResponse {

    private String logradouro;

    private String localidade;

    private String uf;

    private String bairro;

    private String complemento;

}
