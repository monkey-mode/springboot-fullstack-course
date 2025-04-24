package com.monkey_mode.learn_jpa_and_hiberbate.course.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.monkey_mode.learn_jpa_and_hiberbate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    private CourseJdbcRepository repository;

    public CourseJdbcCommandLineRunner(CourseJdbcRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn JPA", "Monkey"));
        repository.insert(new Course(2, "Learn Hibernate", "Monkey"));
        repository.insert(new Course(3, "Learn Spring", "Monkey"));
        repository.insert(new Course(4, "Learn Spring Boot", "Monkey"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }

}
