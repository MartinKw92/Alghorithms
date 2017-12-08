import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinearSearchTest {

    @Test
    public void testFind() {
        int [] input = {4,56,2,12,34,45};
        Search search = new LinearSearch();
        search.search(input,34);
    }

    @Test(expected = NoSuchElementException.class)
    public void testNotFound() {
        int [] input = {4,56,2,12,34,45};
        Search search = new LinearSearch();
        search.search(input,35);
    }


}
