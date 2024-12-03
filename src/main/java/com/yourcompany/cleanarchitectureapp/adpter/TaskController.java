package com.yourcompany.cleanarchitectureapp.adpter;

import com.yourcompany.cleanarchitectureapp.usecase.CreateTaskUseCase;
import com.yourcompany.cleanarchitectureapp.domain.Task;

public class TaskController {
    private final CreateTaskUseCase createTaskUseCase;

    public TaskController(CreateTaskUseCase createTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
    }

    public String createTask(String id, String name) {
        Task task = createTaskUseCase.execute(id, name);
        return "Task Created: " + task.getName();
    }
}
