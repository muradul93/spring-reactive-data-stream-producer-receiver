# Spring Reactive Student Management System

This project is a Reactive Student Management System built using Java, Spring Boot, and WebFlux. It demonstrates how to create a reactive application that can handle a stream of student data.

## Features

- Reactive programming with Spring WebFlux
- RESTful API for managing students
- Server-Sent Events (SSE) for real-time data streaming
- Integration with a relational database using Spring Data

## Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher
- A relational database (e.g., PostgreSQL, MySQL)

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/muradul93/spring-reactive-data-stream-producer-receiver.git
cd spring-reactive-data-stream-producer-receiver
```

### Configure the Database

Update the `application.properties` file with your database configuration:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### Build the Project

```sh
mvn clean install
```

### Run the Application

```sh
mvn spring-boot:run
```

## API Endpoints

### Student Receiver Controller

- **Start Receiving Students**: `GET /api/v1/students/start-receiving`
    - Triggers the process of receiving student data from the server.

### Student Service Receiver

- **Get All Students**: Fetches a stream of student data from the server.

## Project Structure

- `src/main/java/com/murad/reactive/ReactiveAppApplication.java`: Main application class.
- `src/main/java/com/murad/reactive/config/WebClientConfig.java`: Configuration for WebClient.
- `src/main/java/com/murad/reactive/student/Student.java`: Student entity class.
- `src/main/java/com/murad/reactive/student/StudentRepository.java`: Repository interface for Student entity.
- `src/main/java/com/murad/reactive/student/receiver/StudentServiceReceiver.java`: Service class for receiving student data.
- `src/main/java/com/murad/reactive/student/receiver/StudentReceiverController.java`: REST controller for triggering the student data receiving process.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

## Acknowledgements

- Spring Boot
- Spring WebFlux
- Project Reactor

## Contact

For any inquiries or support, please contact [muradul93](https://github.com/muradul93).