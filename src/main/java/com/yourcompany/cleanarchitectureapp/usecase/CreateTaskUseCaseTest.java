package com.yourcompany.cleanarchitectureapp.usecase;

import com.yourcompany.cleanarchitectureapp.domain.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreateTaskUseCaseTest {
    @Test
    void shouldCreateTask() {
        var useCase = new CreateTaskUseCase();
        Task task = useCase.execute("1", "Test Task");

        assertEquals("1", task.getId());
        assertEquals("Test Task", task.getName());
        assertEquals(false, task.isCompleted());
    }
}
