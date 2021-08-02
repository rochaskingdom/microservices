package com.payroll.api.service;

import com.payroll.api.config.AppConfig;
import com.payroll.api.model.request.WorkerRequest;
import com.payroll.api.model.response.PaymentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final AppConfig appConfig;
    private final RestTemplate restTemplate;

    public PaymentResponse findPayment(Long workerId, Integer days) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", String.valueOf(workerId));

        WorkerRequest workerRequest = restTemplate
                .getForObject(appConfig.getWorkerUrl().concat("/workers/{id}"), WorkerRequest.class, uriVariables);

        return PaymentResponse.builder()
                .name(workerRequest.getName())
                .dailyIncome(workerRequest.getDailyIncome())
                .days(days)
                .build();
    }
}
