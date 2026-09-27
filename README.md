# Task Management API

Spring Boot kullanılarak geliştirilmiş, katmanlı mimariye (Layered Architecture) sahip RESTful Task (Görev) Yönetimi API'si.

---

## 📌 Projenin Amacı
Bu projenin amacı; modern yazılım mimarisi standartlarına uygun, sürdürülebilir, güvenli ve ölçeklenebilir bir **REST API** sunmaktır. 

Proje kapsamında **Controller-Service-Repository** katmanlı mimarisi uygulanmış, veri güvenliği ve kapsülleme (encapsulation) için **DTO (Data Transfer Object)** yapısı kullanılmıştır.

---

## 🛠️ Kullanılan Teknolojiler
* **Java 17**
* **Spring Boot 3.x**
  * Spring Web (REST API endpoints)
  * Spring Data JPA (Veri erişim katmanı)
  * Spring Validation (Veri doğrulama)
* **PostgreSQL** (İlişkisel veritabanı)
* **Lombok** (Boilerplate kod azaltımı)
* **Maven** (Bağımlılık yönetimi)

---

## 🚀 API Endpoints

| HTTP Metodu | Endpoint | Açıklama |
| :--- | :--- | :--- |
| **GET** | `/api/tasks` | Tüm görevleri listeler |
| **GET** | `/api/tasks/{id}` | Belirtilen ID'ye sahip görevi getirir |
| **POST** | `/api/tasks` | Yeni bir görev oluşturur |
| **PUT** | `/api/tasks/{id}` | Var olan bir görevi günceller |
| **DELETE** | `/api/tasks/{id}` | Belirtilen görevi siler |

---

## ⚙️ Kurulum ve Çalıştırma

1. Repository'yi klonlayın:
   ```bash
   git clone [https://github.com/kullanici-adi/task-api.git](https://github.com/kullanici-adi/task-api.git)
