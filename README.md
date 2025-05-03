# 🍽️ Restaurant Service

This is a Spring Boot microservice responsible for managing restaurant information in a food delivery system.

## 🔧 Built With
- Java 17
- Spring Boot
- MySQL (via JDBC)
- Maven
- REST API
- GitHub for version control

## 📁 Setup Instructions

### 1. Clone the repository

git clone https://github.com/2023mt93281/Restaurant_service.git
cd Restaurant_service


### 2. Add MySQL database credentials  
Create an `application.properties` file inside `src/main/resources` and add:

spring.datasource.url=jdbc:mysql://localhost:3306/restaurant_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=5000


### 3. Build and Run the project

./mvnw clean install
./mvnw spring-boot:run


## 📡 API Endpoints

| Method | Endpoint            | Description                    |
|--------|---------------------|--------------------------------|
| GET    |  /restaurants       | Get all restaurants            |
| GET    |  /restaurants/{id}  | Get restaurant by ID           |
| POST   |  /restaurants       | Add a new restaurant           |
| PUT    |  /restaurants/{id}  | Update restaurant info         |
| DELETE |  /restaurants/{id}  | Delete a restaurant by ID      |


This service is integrated with the overall food delivery system along with:
-  User Service
-  Order Service
-  Menu Service

