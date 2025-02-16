package com.collaboraid.collaboraid.taskmarketplace.repository;

import com.collaboraid.collaboraid.taskmarketplace.entity.TaskEntity;

import java.util.List;
import java.util.Optional;

public interface TaskRepo {

    List<TaskEntity> findAll();
    Optional<TaskEntity> findById(Long id);
    TaskEntity save(TaskEntity task);
    boolean deleteById(Long id);

}
