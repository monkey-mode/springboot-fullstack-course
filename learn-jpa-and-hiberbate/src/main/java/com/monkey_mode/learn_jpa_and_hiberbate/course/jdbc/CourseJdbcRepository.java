package com.monkey_mode.learn_jpa_and_hiberbate.course.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.monkey_mode.learn_jpa_and_hiberbate.course.Course;

@Repository
public class CourseJdbcRepository {

    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY = """
            INSERT INTO course (id, name, author)
            VALUES (?, ?, ?);
            """;

    private static String DELETE_QUERY = """
            DELETE FROM course WHERE id = ?;
            """;

    private static String SELECT_QUERY = """
            SELECT * FROM course WHERE id = ?;
            """;

    public CourseJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id) {
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }

}
