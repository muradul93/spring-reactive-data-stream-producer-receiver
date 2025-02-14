package com.murad.reactive.student.receiver;

import com.murad.reactive.student.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class StudentServiceReceiver {

    private final WebClient webClient;

    public StudentServiceReceiver(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081/api/v1").build();
    }

    public void getAllStudents() {
        Flux<Student> studentStream = this.webClient.get()
                .uri("/students")  // Make sure this matches the @GetMapping URI
                .accept(MediaType.TEXT_EVENT_STREAM)  // Specify that we want to receive an SSE stream
                .retrieve()
                .bodyToFlux(Student.class);  // Deserialize the response into Flux<Student>

        studentStream.subscribe(student -> {
            // Process each student as it arrives
            System.out.println("Received student: " + student);
        }, error -> {
            // Handle any error in the stream
            System.err.println("Error: " + error.getMessage());
        });
    }
}
