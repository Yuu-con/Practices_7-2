/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.studentsmanagement;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yuu
 */

public class StudentTest {

    @Test
    public void testGetName() {
        Student student = new Student("S001", "Alice", 20);
        assertEquals("Alice", student.getName());
    }

    @Test
    public void testSetAge() {
        Student student = new Student("S002", "Bob", 18);
        student.setAge(21);
        assertEquals(21, student.getAge());
    }

    @Test
    public void testUpdateName() {
        Student student = new Student("S003", "Charlie", 22);
        student.updateName("Charles");
        assertEquals("Charles", student.getName());
    }
}


