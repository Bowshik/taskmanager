package com.bowshik.taskmanager;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final BoardRepository boardRepository;

    public TaskService(TaskRepository taskRepository, BoardRepository boardRepository) {
        this.taskRepository = taskRepository;
        this.boardRepository = boardRepository;
    }

    public List<Task> getTasksByBoard(Long boardId) {
        return taskRepository.findByBoardId(boardId);
    }

    public Task createTask(Long boardId, Task task) {
        Board board = boardRepository.findById(boardId).orElseThrow();
        task.setBoard(board);
        task.setStatus("TODO");
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task updatedTask) {
        Task existing = taskRepository.findById(id).orElseThrow();
        existing.setTitle(updatedTask.getTitle());
        existing.setStatus(updatedTask.getStatus());
        return taskRepository.save(existing);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}