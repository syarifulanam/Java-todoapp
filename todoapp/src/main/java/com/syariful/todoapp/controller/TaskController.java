package com.syariful.todoapp.controller;

import com.syariful.todoapp.entity.Task;
import com.syariful.todoapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/tasks")
    public Task saveTask(@RequestBody Task task) { // data dari postman dilempar ke "@RequestBody Task task"
        // lalu lempar data "task" ke service untuk disimpan

        Task taskSaved = taskService.saveTask(task);
        return taskSaved;

        //return taskService.saveTask(task); // klik CTRL + ALT + CLICK savetask
    }

//    @PostMapping("/tasks")
//    public Task saveTaskManual() {
//        // inisiasi variable task
//        Task task = new Task();
//
//        // isi data secara manual
//        task.setText("isi data manual 1");
//        task.setId(1L);
//
//        // lempar data ke service untuk disimpan
//        return taskService.saveTask(task);
//    }
}
