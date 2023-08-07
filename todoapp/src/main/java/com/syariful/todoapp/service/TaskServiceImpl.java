package com.syariful.todoapp.service;

import com.syariful.todoapp.entity.Task;
import com.syariful.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task saveTask(Task task) {
        Task taskSaved = taskRepository.save(task);
        return taskSaved;
        //return taskRepository.save(task); // lempar data ke repository agar disimpan ke mysql database
    }
}
