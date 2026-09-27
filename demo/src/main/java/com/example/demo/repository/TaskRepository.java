package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;//JpaRepository'den miras alarak,veritabanı işlemlerini SQL sorgusu yazmadan kolayca yapmamızı sağlar
import org.springframework.stereotype.Repository; //@Repository anatasyonunu kullanmamız için gerekli

@Repository

public interface TaskRepository extends JpaRepository<Task,Long>{

}