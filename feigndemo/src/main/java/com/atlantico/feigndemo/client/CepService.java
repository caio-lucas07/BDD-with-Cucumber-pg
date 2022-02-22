package com.atlantico.feigndemo.client;

import com.atlantico.feigndemo.data.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cepService", url = "https://viacep.com.br")
public interface CepService {

    @RequestMapping(method = RequestMethod.GET,
            value = "/ws/{cep}/json/",
            consumes = "application/json")
    CepResponse getCep(@PathVariable("cep") String cep);
}
