package com.mla.designpattern.factory.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TaskProcessor {

    private final AuditService auditService;
    private String taskId;

    // AuditService is injected by Spring
    public TaskProcessor(AuditService auditService) {
        this.auditService = auditService;
    }

    // State initialized by the Factory
    public void init(String taskId) {
        this.taskId = taskId;
    }

    public void execute() {
        System.out.println("Executing task " + taskId);
        auditService.logAction("Task executed: " + taskId);
    }
}
