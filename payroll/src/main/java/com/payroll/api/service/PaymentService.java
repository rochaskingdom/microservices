package com.payroll.api.service;

import com.payroll.api.client.WorkerFeignClient;
import com.payroll.api.model.request.WorkerRequest;
import com.payroll.api.model.response.PaymentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerFeignClient workerFeignClient;

    public PaymentResponse findPayment(Long workerId, Integer days) {
        WorkerRequest workerRequest = workerFeignClient.findById(workerId);
        return PaymentResponse.builder()
                .name(workerRequest.getName())
                .dailyIncome(workerRequest.getDailyIncome())
                .days(days)
                .build();
    }
}
