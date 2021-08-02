package com.worker.api.controller;

import com.worker.api.domain.model.Worker;
import com.worker.api.domain.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/workers")
public class WorkerController {

    private final WorkerService workerService;

    @GetMapping
    public List<Worker> findAll() {
        return workerService.findAll();
    }

    @GetMapping("/{id}")
    public Worker findById(@PathVariable Long id) {
        return workerService.findById(id);
    }

}
