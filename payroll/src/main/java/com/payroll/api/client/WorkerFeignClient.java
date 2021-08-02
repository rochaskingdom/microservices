package com.payroll.api.client;

import com.payroll.api.model.request.WorkerRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "worker", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping("/{id}")
    WorkerRequest findById(@PathVariable Long id);
}
