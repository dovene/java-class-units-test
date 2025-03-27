package tests_lesson.stringhandler;

public class StringHandlerImpl implements StringHandler {

    @Override
    public boolean isNullOrEmpty(String input) {
        return input == null || input.isEmpty();
    }

    @Override
    public int countOccurrences(String input, char c) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    @Override
    public String append(String input, String otherInput) {
        if (input == null) {
            input = "";
        }
        if (otherInput == null) {
            otherInput = "";
        }
        return input + otherInput;
    }

    @Override
    public boolean areEquals(String input, String otherInput) {
        // On considère deux chaînes null comme égales.
        if (input == null && otherInput == null) {
            return true;
        }
        // Si l’une est null et pas l’autre, elles ne sont pas égales.
        if (input == null || otherInput == null) {
            return false;
        }
        // Sinon, on vérifie l’égalité de contenu.
        return input.equals(otherInput);
    }

    @Override
    public char getCharAtIndex(String input, int index) {
        if (input == null) {
            throw new IllegalArgumentException("La chaîne d'entrée est null.");
        }
        if (index < 0 || index >= input.length()) {
            throw new IndexOutOfBoundsException("Index hors limites.");
        }
        return input.charAt(index);
    }
}

