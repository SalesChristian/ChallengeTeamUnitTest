package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test

    void calcSum_shouldReturn25(){
        //GIVEN
        int a=20;
        int b=5;
        int expected = 25;
        //WHEN
        int actual = Main.calcSum(a,b);
        //THEN
        Assertions.assertEquals(expected,actual);


    }
    @Test

    void isEven_shouldReturnTrue(){
        //GIVEN
        int a=20;
        //WHEN
        boolean actual = Main.isEven(a);
        //THEN
        Assertions.assertTrue(actual);
    }
    @Test

    void isEven_shouldReturnFalse(){
        //GIVEN
        int a=21;
        //WHEN
        boolean actual = Main.isEven(a);
        //THEN
        Assertions.assertFalse(actual);
    }
    @Test

    void calcProduct_shouldReturn20() {
        //GIVEN
        int a = 10;
        int b = 2;
        int expected = 20;
        //WHEN
        int actual = Main.calcProduct(a, b);
        //THEN
        Assertions.assertEquals(expected, actual);
    }
@Test

    void toUpper_shouldReturnGRUPPE(){
        //GIVEN
        String name = "gruppe";
        String expected = "GRUPPE";
        //When
        String actual = Main.toUpper(name);
        //THEN
        Assertions.assertEquals(expected, actual);}
@Test
    void numberPositive_whenPositiv_shouldReturnTrue(){
        //GIVEN
        int a = 5;
        //WHEN
        boolean actual = Main.numberpositiv(a);
        //THEN
        Assertions.assertTrue(actual);

}
    @Test
    void numberPositive_whenPositiv_shouldReturnFalse(){
        //GIVEN
        int a = -5;
        //WHEN
        boolean actual = Main.numberpositiv(a);
        //THEN
        Assertions.assertFalse(actual);

    }

}