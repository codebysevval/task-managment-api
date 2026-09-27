package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService{

    private final TaskRepository taskRepository;

    // Constructor Injection: Repository sınıfını buraya bağlıyoruz.
    public TaskService(TaskRepository taskRepository){

        this.taskRepository=taskRepository;
    }

    // 1. Tüm görevleri veritabanından çeken metot (Read)
    public List<Task>getAllTasks(){
        return taskRepository.findAll();
    }

    // 2. ID'ye göre tek bir görevi getiren metot (Read)
    public Optional<Task>getTaskById(Long id){
        return taskRepository.findById(id);
    }
    // 3. Yeni görev oluşturan metot (Create)
    public Task createTask(Task task) {
        task.setCreatedAt(LocalDateTime.now()); // Görevin oluşturulduğu ana saati otomatik ekleriz.
        return taskRepository.save(task); // Veritabanına kaydeder ve kaydedilen nesneyi döndürür.
    }

    // 4. Var olan bir görevi güncelleyen metot (Update)
    public Task updateTask(Long id, Task taskDetails) {
        // Önce güncellenecek görev veritabanında var mı diye bakıyoruz, yoksa hata fırlatıyoruz.
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Görev bulunamadı! ID:"+ id));
        // Gelen yeni bilgilerle eski bilgileri güncelliyoruz.
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.isCompleted());

        return taskRepository.save(task); // Güncellenmiş hali kaydediyoruz.
    }
    // 5. Görevi ID'ye göre silen metot (Delete)
    public void deleteTask(Long id) {
        Task task=taskRepository.findById(id)
                //deleteById metodu void döndürdüğü için orElseThrow bu metotla kullanılamaz;Null olamamlı
                .orElseThrow (() -> new ResourceNotFoundException("Görev bulunamadı! ID:"+ id));
        taskRepository.delete(task);
    }
}
