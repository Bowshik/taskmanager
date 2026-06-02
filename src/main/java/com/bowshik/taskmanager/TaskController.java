package com.bowshik.taskmanager;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/boards/{boardId}/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks(@PathVariable Long boardId) {
        return taskService.getTasksByBoard(boardId);
    }

    @PostMapping
    public Task createTask(@PathVariable Long boardId, @RequestBody Task task) {
        return taskService.createTask(boardId, task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}