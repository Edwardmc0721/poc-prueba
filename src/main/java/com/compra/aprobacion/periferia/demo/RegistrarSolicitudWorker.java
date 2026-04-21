package com.compra.aprobacion.periferia.demo;

import io.camunda.client.annotation.JobWorker;
import io.camunda.client.api.response.ActivatedJob;
import io.camunda.client.api.worker.JobClient;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RegistrarSolicitudWorker {

    @JobWorker(type = "registrar-solicitud")
    public Map<String, Object> handle(JobClient client, ActivatedJob job) {
        Map<String, Object> vars = job.getVariablesAsMap();

        System.out.println("Registrando solicitud: " + vars);

        return vars;
    }
}
