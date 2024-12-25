package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    private final CourseService service = new CourseService();

    Module module = new Module("01","module name","description");
    Course course = new Course("tester","name",9,module);
    String courseId;

    @BeforeEach
    void setUp() {
        courseId = "test";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test getCourse() method - passed")
    void getCourse() {
        assertNull(service.getCourse(courseId), String.format("service.getCourse(%s) should return null", courseId));
    }
}