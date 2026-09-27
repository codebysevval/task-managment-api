package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks") //Bu sınıftaki tüm endpointler böyle başlayacak

public class TaskController {

    private final TaskService taskService;
    public TaskController(TaskService taskService){ //Constructor injection ile bağlıyoruz

        this.taskService=taskService;
    }

    // GET /api/tasks -> Tüm görevleri listeler
    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {//ResponseEntity,veri şablonu+status code döner.
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks); // 200 OK Status kodu ile listeyi döndürür.
    }

    // GET /api/tasks/{id} -> ID'ye göre spesifik görevi getirir
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id)
                .map(ResponseEntity::ok) // Görev varsa 200 OK döner
                .orElse(ResponseEntity.notFound().build()); // Yoksa 404 Not Found döner
    }

    // POST /api/tasks -> Yeni görev oluşturur
    @PostMapping
    public ResponseEntity<Task> createTask(@Valid @RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED); // 201 Created Status kodu döner
    }

    // PUT /api/tasks/{id} -> Görevi günceller
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id,@Valid @RequestBody Task taskDetails) {
        try {
            Task updatedTask = taskService.updateTask(id, taskDetails);
            return ResponseEntity.ok(updatedTask); // Başarılı olursa 200 OK
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build(); // Görev bulunamazsa 404 Not Found
        }
    }

    // DELETE /api/tasks/{id} -> Görevi siler
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok().build(); // Silindikten sonra 200 OK döner
    }
}