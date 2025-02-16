package com.collaboraid.collaboraid.taskmarketplace.service;

import com.collaboraid.collaboraid.taskmarketplace.entity.TaskEntity;
import com.collaboraid.collaboraid.taskmarketplace.repository.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService implements TaskRepo{
    private final List<TaskEntity> tasks = new ArrayList<>();
    private Long nextId = 1L;


    // CRUD starts here:

    @Override
    public List<TaskEntity> findAll() {
        return tasks;
    }

    @Override
    public Optional<TaskEntity> findById(Long id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst();
    }

    @Override
    public TaskEntity save(TaskEntity task) {
        if (task.getId() == null){
            task.setId(nextId++);
            tasks.add(task);
        } else{
            deleteById(task.getId());
            tasks.add(task);
        }

        return task;
    }

    @Override
    public boolean deleteById(Long id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }


}
