package com.example.preudhomme;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class JunitTest {
    @Test
    public void testMethod(){
        System.out.println("JunitTest.testMethod");
        assertEquals(2, 1 +1 );
    }
}
