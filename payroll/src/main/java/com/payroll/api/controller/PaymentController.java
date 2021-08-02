package com.payroll.api.controller;

import com.payroll.api.controller.response.PaymentResponse;
import com.payroll.api.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/{workerId}/days/{days}")
    public PaymentResponse findPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        return paymentService.findPayment(workerId, days);
    }
}
