package tests_lesson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tests_lesson.stringhandler.StringHandler;
import tests_lesson.stringhandler.StringHandlerImpl;

public class StringHandlerImplTest {

    private StringHandler handler;
    // setup
    @BeforeEach
    public void setup() {
        handler = new StringHandlerImpl();
    }

    @Test
    public void testIsNullOrEmpty_WithNull() {
        //Given
        String input = null;
        //When
        handler.isNullOrEmpty(input);
        //Then
        assertTrue(handler.isNullOrEmpty(input));
    }

    @Test
    public void testIsNullOrEmpty_WithEmptyString() {
        //Given
        String input = "";
        //When
        handler.isNullOrEmpty(input);
        //Then
        assertTrue(handler.isNullOrEmpty(input));
    }

    @Test
    public void testCountOccurrences_WithOccurrences() {
        //Given
        String input = "banana";
        //When
        handler.countOccurrences(input, 'a');
        //Then
        assertEquals(3, handler.countOccurrences(input, 'a'));
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

