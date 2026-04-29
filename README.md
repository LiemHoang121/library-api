# 📚 Library API

> REST API quản lý sách xây dựng bằng Java Spring Boot + SQL Server, tích hợp giao diện web HTML/CSS/JS thuần.

---

## 🛠️ Tech Stack

| Thành phần | Công nghệ |
|---|---|
| Backend | Java 21, Spring Boot 3.x |
| Database | SQL Server (SQLEXPRESS) |
| ORM | Spring Data JPA / Hibernate |
| Build tool | Maven |
| Frontend | HTML5, CSS3, JavaScript (Vanilla) |
| API Test | Postman |

---

## ✨ Tính năng

- **CRUD đầy đủ:** Thêm, xem, sửa, xóa sách
- **Tìm kiếm** theo tên sách hoặc tác giả (client-side)
- **Phân trang** 5 sách/trang
- **Tab Tác giả:** Tổng hợp tác giả và số sách
- **Tab Thống kê:** Tổng quan dữ liệu thư viện
- **Giao diện web** tích hợp thẳng vào Spring Boot (không cần server riêng)
- **Toast notification** khi thêm/sửa/xóa thành công

---

## 🚀 Cài đặt & Chạy

### Yêu cầu
- Java 21+
- Maven 3.x
- SQL Server (SQLEXPRESS)

### 1. Clone project
```bash
git clone https://github.com/<your-username>/library-api.git
cd library-api
```

### 2. Tạo database
Mở SQL Server Management Studio, chạy:
```sql
CREATE DATABASE library_db;
```

### 3. Cấu hình kết nối
Mở file `src/main/resources/application.properties`, sửa thông tin phù hợp:
```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=library_db;encrypt=true;trustServerCertificate=true
spring.datasource.username=sa
spring.datasource.password=YOUR_PASSWORD
```

### 4. Chạy project
```bash
mvn spring-boot:run
```

Mở trình duyệt, vào: **http://localhost:8080**

---

## 📡 API Endpoints

| Method | URL | Mô tả |
|--------|-----|-------|
| `GET` | `/books` | Lấy danh sách tất cả sách |
| `GET` | `/books/{id}` | Lấy thông tin 1 sách theo ID |
| `POST` | `/books` | Thêm sách mới |
| `PUT` | `/books/{id}` | Cập nhật thông tin sách |
| `DELETE` | `/books/{id}` | Xóa sách |

### Ví dụ request (POST /books)
```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
```

### Ví dụ response
```json
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
```

---

## 📁 Cấu trúc project

```
src/main/java/com/iuh/libraryapi/
├── controller/
│   ├── BookController.java     # Xử lý HTTP request
│   └── HelloController.java
├── model/
│   └── Book.java               # Entity mapping với bảng books
├── repository/
│   └── BookRepository.java     # Truy vấn database qua JPA
└── LibraryApiApplication.java

src/main/resources/
├── application.properties      # Cấu hình database, server
└── static/
    └── index.html              # Giao diện web frontend
```

---

## 👨‍💻 Tác giả

**Liem Hoang** — Sinh viên Khoa học Máy tính, IUH

---

## 📝 License

MIT
