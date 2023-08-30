package com.github.curriculeon;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public String concatenation(String firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public String concatenation(int firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public String getPrefix(String input) {
        return input.substring(0,3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public String getSuffix(String input) {
        return input.substring((input.length() - 3));
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public Boolean compareTwoStrings(String inputValue, String comparableValue) {
        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public Character getMiddleCharacter(String inputValue) {
        return inputValue.charAt(inputValue.length() / 2);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public String getFirstWord(String spaceDelimitedString) {
        int i = spaceDelimitedString.indexOf(' ');
        return spaceDelimitedString.substring(0, i);
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public String getSecondWord(String spaceDelimitedString) {
        int i = spaceDelimitedString.indexOf(' ');
        return spaceDelimitedString.substring(i + 1);
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public String reverse(String stringToReverse) {
        StringBuilder s = new StringBuilder(stringToReverse);
        s.reverse();
        return s.toString();
    }
}
