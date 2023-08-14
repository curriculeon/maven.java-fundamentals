package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class TestStringUtilities {
    private StringUtilities stringUtilities = new StringUtilities();
    @Test
    public void getHelloWorldTest() {
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String expected = "Hello World";

        // : When
        String actual = stringUtilities.getHelloWorld();

        // : Then
        assertEquals(expected, actual);

    }

    @Test
    public void concatenationStringTest(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String one = "Hello";
        String two = " Java";
        String expected = "Hello Java";

        // : When
        String actual = stringUtilities.concatenation(one,two);


        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void concatenationStringAndIntegerTest(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        int one = 1;
        String two = " Java";
        String expected = "1 Java";

        // : When
        String actual = stringUtilities.concatenation(one,two);


        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void substringBeginTest1(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Hello";
        String expected = "Hel";

        // : When
        String actual = stringUtilities.getPrefix(input);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void substringBeginTest2(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Quicker";
        String expected = "Qui";

        // : When
        String actual = stringUtilities.getPrefix(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void substringEndTest1(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Hello";
        String expected = "llo";

        // : When
        String actual = stringUtilities.getSuffix(input);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void substringEndTest2(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Quicker";
        String expected = "ker";

        // : When
        String actual = stringUtilities.getSuffix(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareToEquals1(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String inputValue = "curriculeon";
        String comparableValue = "curriculeon";

        // : When
        boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertTrue(actual);
    }


    @Test
    public void testCompareToEquals2(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String inputValue = "leon";
        String comparableValue = "leon";

        // : When
        boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertTrue(actual);
    }


    @Test
    public void testCompareToNotEquals1(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String inputValue = "curriculeon";
        String comparableValue = "curriculeo";

        // : When
        boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertFalse(actual);
    }


    @Test
    public void testCompareToNotEquals2(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String inputValue = "leon";
        String comparableValue = "leo";

        // : When
        boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertFalse(actual);
    }

    @Test
    public void getTheMiddleCharOfLeon(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "leon";
        Character expected = 'o';

        // : When
        Character actual = stringUtilities.getMiddleCharacter(input);

        // : Then
        Assert.assertEquals(expected.toString(), actual.toString());
    }


    @Test
    public void getTheMiddleCharOfLeo(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "leo";
        Character expected = 'e';

        // : When
        Character actual = stringUtilities.getMiddleCharacter(input);

        // : Then
        Assert.assertEquals(expected.toString(), actual.toString());
    }


    @Test
    public void getTheFirstWord1(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Curriculeon Curriculum";
        String expected = "Curriculeon";

        // : When
        String actual = stringUtilities.getFirstWord(input);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void getTheFirstWord2(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Leon Hunter";
        String expected = "Leon";

        // : When
        String actual = stringUtilities.getFirstWord(input);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void getTheSecondWord1(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Curriculeon Curriculum";
        String expected = "Curriculum";

        // : When
        String actual = stringUtilities.getSecondWord(input);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void getTheSecondWord2(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Leon Hunter";
        String expected = "Hunter";

        // : When
        String actual = stringUtilities.getSecondWord(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void reverse1(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Curriculeon";
        String expected = "noelucirruC";


        // : When
        String actual = stringUtilities.reverse(input);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void reverseThem(){
        // : Given
        final StringUtilities stringUtilities = new StringUtilities();
        String input = "Leon Hunter";
        String expected = "retnuH noeL";


        // : When
        String actual = stringUtilities.reverse(input);

        // : Then
        assertEquals(expected, actual);
    }
}
