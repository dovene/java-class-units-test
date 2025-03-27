package tests_lesson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import tests_lesson.stringhandler.StringHandler;
import tests_lesson.stringhandler.StringHandlerImpl;

public class StringHandlerImplTest {

    private final StringHandler handler = new StringHandlerImpl();

    @Test
    public void testIsNullOrEmpty_WithNull() {
        assertTrue(handler.isNullOrEmpty(null));
    }

    @Test
    public void testIsNullOrEmpty_WithEmptyString() {
        assertTrue(handler.isNullOrEmpty(""));
    }

    @Test
    public void testCountOccurrences_WithOccurrences() {
        assertEquals(3, handler.countOccurrences("banana", 'a'));
    }

    @Test
    public void testReverse_WithNonNull() {
        assertEquals("olleH", handler.reverse("Hello"));
    }

    @Test
    public void testAppend_BothNonNull() {
        assertEquals("HelloWorld", handler.append("Hello", "World"));
    }
   
    @Test
    public void testAreEquals_SameStrings() {
        assertTrue(handler.areEquals("Hello", "Hello"));
    }

    @Test
    public void testGetCharAtIndex_Valid() {
        assertEquals('e', handler.getCharAtIndex("Hello", 1));
    }
}

