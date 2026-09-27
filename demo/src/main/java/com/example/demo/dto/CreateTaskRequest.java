package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import  lombok.Data;

@Data
public class CreateTaskRequest {
    @NotBlank(message="Null veya sadece boş karakterden oluşamaz")
    @Size(min=3,max=100,message="Başlık 3 ile 100 karakter arasında olmalıdır")
    private String title;
    private String description;
    private boolean completed;
}
