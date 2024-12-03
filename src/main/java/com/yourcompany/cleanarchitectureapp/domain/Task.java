package com.yourcompany.cleanarchitectureapp.domain;

public class Task {
    private String id;
    private String name;
    private boolean completed;

    public Task(String id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }
}
