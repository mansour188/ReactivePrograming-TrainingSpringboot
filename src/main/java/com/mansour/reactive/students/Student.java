package com.mansour.reactive.students;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table("students")
public class Student {
    @Id
    private  Integer id ;
    private String firstname ;
    private String lastname;
    private int age;
}
