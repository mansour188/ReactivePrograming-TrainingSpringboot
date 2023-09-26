package com.mansour.reactive.students;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface StudentRepo extends ReactiveCrudRepository<Student,Integer> {
    @Override
    Mono<Student> findById(Integer integer);
    Mono<Student> findAllByFirstnameIgnoreCase(String firstname);
}
