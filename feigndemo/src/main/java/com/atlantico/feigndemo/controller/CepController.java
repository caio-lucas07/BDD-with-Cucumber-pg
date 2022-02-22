package com.atlantico.feigndemo.controller;

import com.atlantico.feigndemo.client.CepService;
import com.atlantico.feigndemo.data.CepResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@AllArgsConstructor
public class CepController {

    private final CepService cepService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/ws/{cep}/json/", method = RequestMethod.GET)
    public CepResponse getCep(@PathVariable String cep) {
        log.info("Getting CEP!");
        return cepService.getCep(cep);
    }
}