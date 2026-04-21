package com.compra.aprobacion.periferia.demo;


import io.camunda.client.annotation.JobWorker;
import io.camunda.client.api.response.ActivatedJob;
import org.springframework.stereotype.Component;

@Component
public class NotificarAprobacionWorker {

    @JobWorker(type = "notificar-aprobacion")
    public void handle(ActivatedJob job) {
        System.out.println("⚠️ Compra requiere aprobación");
    }
}
