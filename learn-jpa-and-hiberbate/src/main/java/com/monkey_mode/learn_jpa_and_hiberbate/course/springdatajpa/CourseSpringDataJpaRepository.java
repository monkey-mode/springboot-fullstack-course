package com.monkey_mode.learn_jpa_and_hiberbate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monkey_mode.learn_jpa_and_hiberbate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
