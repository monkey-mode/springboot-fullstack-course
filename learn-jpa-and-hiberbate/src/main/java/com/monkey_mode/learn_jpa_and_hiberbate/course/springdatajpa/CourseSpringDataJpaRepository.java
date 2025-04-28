package com.monkey_mode.learn_jpa_and_hiberbate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monkey_mode.learn_jpa_and_hiberbate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);

    List<Course> findByName(String name);

    List<Course> findByNameAndAuthor(String name, String author);

    List<Course> findByNameOrAuthor(String name, String author);

}
