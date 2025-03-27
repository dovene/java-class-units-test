package tests_lesson.stringhandler;

public interface StringHandler {
    boolean isNullOrEmpty(String input);
    int countOccurrences(String input, char c);
    String reverse(String input);
    String append(String input, String otherInput);
    boolean areEquals(String input, String otherInput);
    char getCharAtIndex(String input, int index);
}

