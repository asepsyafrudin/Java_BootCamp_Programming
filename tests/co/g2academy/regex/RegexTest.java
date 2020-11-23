package co.g2academy.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegexTest {

    @Test
    public void testSingleCharacterRegexUsingIterativeCode() {
        Pattern pattern = Pattern.compile(".s");
        Matcher matcher = pattern.matcher("as");
        boolean actual = matcher.matches();
        assertTrue(actual);
    }

    @Test
    public void testSingleCharacterUsingChainCode() {
        assertTrue(Pattern.compile(".s").matcher("as").matches());
    }

    @Test
    public void testSingleCharacterUsingPatternMatchesCode() {
        assertTrue(Pattern.matches(".s","as"));
    }

    @Test
    public void regexValidationEmail() {
        assertTrue(Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", "asseeppsyafrudin@gmail.com"));
    }

    @Test
    public void regexInvalidValidationEmail() {
        assertFalse(Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", "asseeppsyafrudin@gmail"));
    }

    @Test
    public void testCharacter() {
        assertTrue(Pattern.matches("[abc]", "a"));

    }

    @Test
    public void testCharacter2() {
        assertTrue(Pattern.matches("[abc]?", ""));

    }
}
