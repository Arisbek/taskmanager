package com.example.TaskManager.service;

import com.example.TaskManager.model.Task;

import com.example.TaskManager.exception.TaskNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TaskService {
    private Map<String, Task> tasks = new HashMap<>();

    public void addTask(Task task) {
        tasks.put(task.getId(), task);
    }

    public Task getTask(String id) {
        Task task = tasks.get(id);
        if (task == null) {
            throw new TaskNotFoundException("Task with id " + id + " not found");
        }
        return task;
    }

    public void deleteTask(String id) {
        if (!tasks.containsKey(id)) {
            throw new TaskNotFoundException("Task with id " + id + " not found");
        }
        tasks.remove(id);
    }

    public Map<String, Task> getAllTasks() {
        return tasks;
    }
}