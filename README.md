#  CodeStore: Spring Boot E-Commerce Backend

**Tech stack:** Java 17, Spring Boot, Spring Data JPA, PostgreSQL, Docker, Thymeleaf

---

##  Overview

CodeStore is a backend application for a simple e-commerce platform, built using Java and Spring Boot. It includes core features such as product management, user registration with role-based access, cart handling, and order processing.


---

##  Features

-  **Products:** Add, view, and manage store products
-  **User Registration:** Secure user sign-up with default role assignment
-  **Password Encryption:** BCrypt hashing via Spring Security
-  **Shopping Cart:** Users can manage items in their cart
-  **Order & OrderItems:** Checkout flow and stock linking
-  **Roles:** Basic role-based permissions setup (USER, ADMIN)
-  **PostgreSQL via Docker Compose**
-  **Web Interface:** Basic Thymeleaf form for registration
-  **JPA/Hibernate:** Auto table creation and data persistence

---

## 📂 Project Structure

```
src/main/java/com/codestore/store
├── Controller
│   ├── auth (AuthController for register form)
│   ├── productcontroller
│   └── ...
├── dto
│   └── registerrequest
├── entity
│   ├── ProductEntity.java
│   ├── UserEntity.java
│   ├── RoleEntity.java
│   ├── OrderEntity.java
│   ├── OrderItemEntity.java
│   └── CardEntity.java
├── repository
├── service
│   ├── cardservice
│   ├── userservice
│   ├── productservice
│   ├── roleservice
│   ├── orderservice
│   └── orderitemservice
└── config
    └── SecurityConfig.java
```

---

##  Setup Instructions

###  1. Run PostgreSQL with Docker

```yaml
# docker-compose.yml
services:
  postgres:
    image: postgres:latest
    container_name: store_postgres
    environment:
      POSTGRES_DB: shopdb
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: secret
    ports:
      - "5432:5432"
    volumes:
      - pgdata:/var/lib/postgresql/data
volumes:
  pgdata:
```

Start the DB:

```bash
docker-compose up -d
```

---

###  2. Run Spring Boot App

Update your `application.yaml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/shopdb
    username: postgres
    password: secret
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

Start the app from IntelliJ or with:

```bash
./mvnw spring-boot:run
```

---

##  Security Config

Security is customized to allow public access to `/register` and protect future endpoints.

---

##  Registration Endpoint

- HTML form: `/register`
- POST action: `/api/auth/register`
- Default role `USER` is assigned automatically on successful registration

---


##  Future Improvements

- User login & JWT authentication
- Admin dashboard
- Frontend UI with Angular or React
- Product image upload
- Checkout and payment simulation
