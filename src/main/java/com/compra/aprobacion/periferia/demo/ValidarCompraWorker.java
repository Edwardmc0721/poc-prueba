package com.compra.aprobacion.periferia.demo;

import io.camunda.client.annotation.JobWorker;
import io.camunda.client.api.response.ActivatedJob;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ValidarCompraWorker {

    @JobWorker(type = "validar-compra")
    public Map<String, Object> handle(ActivatedJob job) {

        Map<String, Object> vars = job.getVariablesAsMap();

        System.out.println("Validando compra");

        return vars;
    }
}
