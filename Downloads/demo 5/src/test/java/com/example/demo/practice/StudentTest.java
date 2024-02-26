package com.example.demo.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    public void countShouldIncrementByOneOnCreationOfObject() {
        Student s = new Student(1, "Hari");
        //assertEquals(1, Student.studentCount);
        assertEquals("Hari", s.getName());
        assertEquals(1, s.getRollNo());
    }

    @Test
    public void shouldReturnEvenIfGivenNumberIsEven() {
        Student s = new Student(1, "Hari");
        String returnValue = s.numberIsOddOrEven(2);
        assertEquals("even", returnValue);
    }

    @Test
    public void shouldReturnOddIfGivenNumberIsOdd() {
        Student s = new Student(1, "Hari");
        String returnValue = s.numberIsOddOrEven(3);
        assertEquals("odd", returnValue);
    }
}