package com.murad.reactive.student.receiver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentReceiverController {

    private final StudentServiceReceiver studentServiceReceiver;

    public StudentReceiverController(StudentServiceReceiver studentServiceReceiver) {
        this.studentServiceReceiver = studentServiceReceiver;
    }

    // Trigger receiving students from the server
    @GetMapping("/start-receiving")
    public String startReceivingStudents() {
        studentServiceReceiver.getAllStudents();
        return "Started receiving students stream.";
    }
}
