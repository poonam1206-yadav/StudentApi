# Student Management REST API

A simple backend REST API built with Spring Boot to manage student records.

### Tech Stack
- Java, Spring Boot, Spring Data JPA, MySQL, Maven, Postman

### Features
- Create, Read, Update, Delete (CRUD) APIs for Student entity
- Layered Architecture: Controller -> Service -> Repository
- MySQL integration with JPA / Hibernate
- Exception handling and validation

### APIs
- POST /api/students - Add new student
- GET /api/students - Get all students
- GET /api/students/{id} - Get student by ID
- PUT /api/students/{id} - Update student
- DELETE /api/students/{id} - Delete student

### How to Run
1. Clone repo
2. Configure MySQL in application.properties
3. Run: mvn spring-boot:run
