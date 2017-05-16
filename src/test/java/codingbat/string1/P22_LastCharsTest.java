package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P22_LastCharsTest {

    private P22_LastChars fixture;
    
    @Before
    public void setUp() {
        fixture = new P22_LastChars();
    }

    @Test
    public void testcase1() {
        String a = "last";
        String b = "chars";
        
        String expected = "ls";
        
        String actual = fixture.lastChars(a, b);
        
        assertThat(actual, is(equalTo(expected)));
    }
    
    @Test
    public void testcase2() {
        String a = "yo";
        String b = "java";
        
        String expected = "ya";
        
        String actual = fixture.lastChars(a, b);
        
        assertThat(actual, is(equalTo(expected)));
    }
    
    @Test
    public void testcase3() {
        String a = "hi";
        String b = "";
        
        String expected = "h@";
        
        String actual = fixture.lastChars(a, b);
        
        assertThat(actual, is(equalTo(expected)));
    }
    
    @Test
    public void shouldReturnDoubleAtWhenBothAreNull() {
        String a = null;
        String b = null;
        
        String expected = "@@";
        
        String actual = fixture.lastChars(a, b);
        
        assertThat(actual, is(equalTo(expected)));
    }
    
    @Test
    public void shouldReturnDoubleAtWhenBothAreEmpty() {
        String a = "";
        String b = "";
        
        String expected = "@@";
        
        String actual = fixture.lastChars(a, b);
        
        assertThat(actual, is(equalTo(expected)));
    }
    
    @Test
    public void shouldReturnDoubleAtWhenOneIsNullAndOtherIsEmpty() {
        String a1 = "";
        String b1 = null;
        String a2 = null;
        String b2 = "";
        
        String expected = "@@";
        
        String actual1 = fixture.lastChars(a1, b1);
        String actual2 = fixture.lastChars(a2, b2);
        
        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }
    
}
