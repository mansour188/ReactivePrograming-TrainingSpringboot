package com.mansour.reactive.students;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@AllArgsConstructor
@Service
public class StudentService {
    private StudentRepo studentRepo;
    public  Flux<Student> getAllStudents(){
        return studentRepo.findAll().delayElements(Duration.ofSeconds(1));
    }
    public Mono<Student> getStudentById(Integer id){
        return  studentRepo.findById(id);
    }

    public Mono<Student> getStudentByUsername(String username){
        return  studentRepo.findAllByFirstnameIgnoreCase(username);
    }
    public Mono<Student> saveStudent(Student student){
        return studentRepo.save(student);
    }
}
