package com.monkey_mode.learn_jpa_and_hiberbate.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.monkey_mode.learn_jpa_and_hiberbate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    // private CourseJdbcRepository repository;
    // private CourseJpaRepository repository;
    private CourseSpringDataJpaRepository repository;

    public CourseCommandLineRunner(CourseSpringDataJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn JPA", "Monkey"));
        repository.save(new Course(2, "Learn Hibernate", "Monkey"));
        repository.save(new Course(3, "Learn Spring", "Monkey"));
        repository.save(new Course(4, "Learn Spring Boot", "Monkey"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
    }

}
