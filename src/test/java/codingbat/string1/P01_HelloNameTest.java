package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P01_HelloNameTest {

    private P01_HelloName fixture;

    @Before
    public void setUp() {
        fixture = new P01_HelloName();
    }

    @Test
    public void shouldReturnHelloWhenNameIsNull() {

        String name = null;

        String expected = "Hello!";

        String actual = fixture.helloName(name);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnHelloWhenNameIsEmpty() {

        String name = "";

        String expected = "Hello!";

        String actual = fixture.helloName(name);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnGreetingWhenNameIsNotEmpty1() {

        String name = "Bob";

        String expected = "Hello Bob!";

        String actual = fixture.helloName(name);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnGreetingWhenNameIsNotEmpty2() {

        String name = "X";

        String expected = "Hello X!";

        String actual = fixture.helloName(name);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnGreetingWhenNameIsNotEmpty3() {

        String name = "Alice";

        String expected = "Hello Alice!";

        String actual = fixture.helloName(name);

        assertThat(actual, is(equalTo(expected)));
    }
}
