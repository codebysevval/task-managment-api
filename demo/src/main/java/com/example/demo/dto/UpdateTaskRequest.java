package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class UpdateTaskRequest {
    @NotBlank(message="Başlık boş bırakılamaz")
    @Size(min=3,max=100,message="Mesaj 3 ile 100 karakter arasında olmalıdır")
    private String title;
    private String description;
    private boolean  completed;
}
