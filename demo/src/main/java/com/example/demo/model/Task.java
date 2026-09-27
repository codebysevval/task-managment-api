package com.example.demo.model;

import jakarta.persistence.*; //veritabanı tablolarına dönüştürmesi için
import lombok.Data; //temel metotlar için(set,get metotlarını otomatik oluşturur)
import java.time.LocalDateTime;

@Entity
@Table(name="tasks")
@Data //Lombook kütüphanesidir; class'daki tüm alanlar için getter,setter,toString,equals metotlarını üretir

public class Task{
    @Id //veritabanı tablosunun primary key kısmı olduğunu belirtir
    @GeneratedValue (strategy=GenerationType.IDENTITY) //Id değeri,veritabanı tarafından birer  birer artıcak şekilde atanacak
    private Long id;

    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt; //değeri otamatik oluşturulacak
}