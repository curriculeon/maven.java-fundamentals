package com.github.curriculeon;

import com.sun.deploy.util.ArrayUtil;
import com.sun.org.apache.bcel.internal.generic.ArrayInstruction;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import jdk.nashorn.internal.runtime.arrays.ArrayData;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
import sun.plugin.javascript.navig.Array;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */

    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        return (firstSegment + secondSegment);
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        return input.substring(0, 3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        return input.substring(2, 5);
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {
        int totalNumberOfCharacters = inputValue.length();
        int middle = totalNumberOfCharacters / 2;
        int remainder = totalNumberOfCharacters % 2;

        boolean isEven = remainder == 0;
//        if (totalNumberOfCharacters = an even number )
        if (isEven) {
            middle = (middle) - 1;
        }

        return inputValue.charAt(middle);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString) {
        String[] splitWord = spaceDelimitedString.split(" ");
        return splitWord[0];

    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString) {
        String[] splitWord = spaceDelimitedString.split(" ");
        return splitWord[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse) {
        // [z, i, p, c, o, d,
         char[] stringCharacters = stringToReverse.toCharArray();
        String reverse = new StringBuilder(new String(stringCharacters)).reverse().toString();

        return reverse;
    }
}
