package com.murad.reactive.student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentService studentService;



    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Mono<Student> getStudentById(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }



    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Student> create(@RequestBody StudentRequest request) {
        return studentService.save(request);
    }

    @GetMapping("/filter")
    public Flux<Student> findByAuthor(@RequestParam String name) {
        return studentService.findByFirstname(name);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.deleteById(id);
    }

}
