package com.generation.service;

import com.generation.model.Student;
import org.junit.jupiter.api.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private final StudentService service = new StudentService();
    private final Map<String, Student> students = new HashMap<>();
    String studentId;

    @BeforeEach
    void setUp() {
        studentId = "01";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test findStudent() method - all passed")
    void findStudent() {
        assertEquals(students.get(studentId), service.findStudent(studentId), String.format("findStudent(%s) should return null", studentId));
    }

    @Test
    @DisplayName("Test isSubscribed() method - all passed")
    void isSubscribed() {
        assertFalse(service.isSubscribed(studentId), String.format("isSubscribed(%s) should return false", studentId));
    }
}