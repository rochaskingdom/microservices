package com.worker.api.controller;

import com.worker.api.domain.model.Worker;
import com.worker.api.domain.service.WorkerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/workers")
public class WorkerController {

    private final Environment environment;
    private final WorkerService workerService;

    @GetMapping
    public List<Worker> findAll() {
        return workerService.findAll();
    }

    @GetMapping("/{id}")
    public Worker findById(@PathVariable Long id) {
        log.info("PORT = " + environment.getProperty("local.server.port"));
        return workerService.findById(id);
    }

}
