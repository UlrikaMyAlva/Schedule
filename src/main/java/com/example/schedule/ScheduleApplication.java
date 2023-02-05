package com.example.schedule;

import clients.ClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScheduleApplication {

    public static void main(String[] args) {

        //SpringApplication.run(ScheduleApplication.class, args);

        ClientService clientService = new ClientService();

        clientService.hello();

    }


}
