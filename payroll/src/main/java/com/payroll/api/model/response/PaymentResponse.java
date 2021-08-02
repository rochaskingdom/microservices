package com.payroll.api.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponse {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public double getTotal() {
        return this.days * this.dailyIncome;
    }
}
