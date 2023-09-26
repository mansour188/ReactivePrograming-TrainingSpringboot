package com.mansour.reactive.students;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private  StudentService studentService;
    @PostMapping
    public Mono<Student> saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student) ;
    }

    @GetMapping("/{id}")
    public Mono<Student> getStudentById(@PathVariable("id") Integer id){
        return studentService.getStudentById(id);
    }
    @GetMapping("")
    public Flux<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
