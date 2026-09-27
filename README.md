# Task Management API

Spring Boot ve PostgreSQL kullanılarak geliştirilmiş, katmanlı mimariye (Layered Architecture) sahip RESTful Görev (Task) Yönetim API'si.

---

## 📌 Projenin Amacı
Bu proje; modern backend mimarisi standartlarına uygun, sürdürülebilir ve ölçeklenebilir bir **REST API** sunmaktadır. 

Proje kapsamında **Controller-Service-Repository** katmanlı mimarisi uygulanmış, veri erişimi için **Spring Data JPA** ve veritabanı olarak **PostgreSQL** entegrasyonu sağlanmıştır.

---

## 🛠️ Kullanılan Teknolojiler
* **Java 17**
* **Spring Boot**
  * Spring Web (REST API uç noktaları)
  * Spring Data JPA (Veri erişim katmanı)
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
| **PUT** | `/api/tasks/{id}` | Var olan görevi günceller |
| **DELETE** | `/api/tasks/{id}` | Belirtilen ID'ye sahip görevi siler |

---

## ⚙️ Kurulum ve Çalıştırma

1. Projeyi klonlayın:
   ```bash
   git clone [https://github.com/codebysevval/task-management-api.git](https://github.com/codebysevval/task-management-api.git)
   cd task-management-api
