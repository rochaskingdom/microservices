package com.payroll.api.service;

import com.payroll.api.controller.response.PaymentResponse;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentResponse findPayment(Long workerId, Integer days) {
        return PaymentResponse.builder()
                .name("Bob")
                .dailyIncome(200.0)
                .days(days)
                .build();
    }
}
