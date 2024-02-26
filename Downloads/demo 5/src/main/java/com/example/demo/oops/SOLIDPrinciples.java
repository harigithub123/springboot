package com.example.demo.oops;

import org.springframework.util.StringUtils;

/**
 * S - Single Responsibility. Class should have only one reason to change.
 * That means class should have only one responsibility.
 *
 * AreaCalculator
 *  calculateArea()
 *  displayResult();
 *
 *  We should not have display result in Area Calculator.
 *
 * O - Open close principle
 *
 *  * AreaCalculator
 *  *  calculateArea() -  calculating area for square and rectangle with if else.
 *  If we need to add other shapes then we need to modify AreaCalculator class.
 *  Better to have interface Shape with calculateArea() method.
 *  Implement it in each Shape. Pass list of shapes to AreaCalculator class, and
 *  you don't need to worry about addition of new shapes.
 *
 *
 * L - LisKOV Substitution principle.
 *
 */
public class SOLIDPrinciples {

    public static void main(String[] args) {
        String s = "";

    }
}
