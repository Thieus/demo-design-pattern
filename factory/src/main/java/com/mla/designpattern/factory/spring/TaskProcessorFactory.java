package com.mla.designpattern.factory.spring;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class TaskProcessorFactory {

    private final ObjectProvider<TaskProcessor> taskProcessorProvider;

    public TaskProcessorFactory(ObjectProvider<TaskProcessor> taskProcessorProvider) {
        this.taskProcessorProvider = taskProcessorProvider;
    }

    public TaskProcessor createProcessor(String taskId) {
        // Obtains a fresh new instance of TaskProcessor from Spring, 
        // with all @Autowired dependencies (AuditService) correctly wired.
        TaskProcessor processor = taskProcessorProvider.getObject();
        // Initialize state
        processor.init(taskId);
        return processor;
    }
}
