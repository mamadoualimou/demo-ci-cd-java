package com.example.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Mamadou-Alimou Diallo
 * 09/02/2026
 */
public class CalculatorTest {

    @Test
    void shouldAddTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
    }

}
