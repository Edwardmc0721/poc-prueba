//package com.compra.aprobacion.periferia.demo;
//
//import io.camunda.zeebe.client.ZeebeClient;
//import jakarta.annotation.PostConstruct;
//import org.springframework.stereotype.Component;
//
//@Component
//public class StartProcess {
//
//    private final ZeebeClient client;
//
//    public StartProcess(ZeebeClient client) {
//        this.client = client;
//    }
//
//    @PostConstruct
//    public void start() {
//
//        client.newCreateInstanceCommand()
//                .bpmnProcessId("Process_1006hse") // 👈 este es el correcto
//                .latestVersion()
//                .variables("{\"monto\":300000}")
//                .send()
//                .join();
//        System.out.println("🚀 Proceso iniciado");
//    }
//}