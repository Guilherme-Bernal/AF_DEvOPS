package com.yourcompany.cleanarchitectureapp.usecase;

import com.yourcompany.cleanarchitectureapp.domain.Task;

public class CreateTaskUseCase {
    public Task execute(String id, String name) {
        return new Task(id, name, false);
    }
}
