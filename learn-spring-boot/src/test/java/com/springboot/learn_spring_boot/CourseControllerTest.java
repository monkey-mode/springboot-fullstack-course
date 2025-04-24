package com.springboot.learn_spring_boot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseControllerTest {

    private CourseController courseController = new CourseController();

    @Test
    public void retrieveAllCourses_shouldReturnListOfCourses() {
        // When
        List<Course> courses = courseController.retrieveAllCourses();

        // Then
        assertNotNull(courses);
        assertEquals(4, courses.size());

        // Verify first course
        Course firstCourse = courses.get(0);
        assertEquals(1, firstCourse.getId());
        assertEquals("Learn AWS", firstCourse.getName());
        assertEquals("in28minutes", firstCourse.getAuthor());

        // Verify second course
        Course secondCourse = courses.get(1);
        assertEquals(2, secondCourse.getId());
        assertEquals("Learn DevOps", secondCourse.getName());
        assertEquals("in28minutes", secondCourse.getAuthor());

        // Verify third course
        Course thirdCourse = courses.get(2);
        assertEquals(3, thirdCourse.getId());
        assertEquals("Learn Azure", thirdCourse.getName());
        assertEquals("in28minutes", thirdCourse.getAuthor());

        // Verify fourth course
        Course fourthCourse = courses.get(3);
        assertEquals(4, fourthCourse.getId());
        assertEquals("Learn GCP", fourthCourse.getName());
        assertEquals("in28minutes", fourthCourse.getAuthor());
    }
}