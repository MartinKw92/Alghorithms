import org.junit.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void search() {
        int [] input = {4,56,2,12,34,45};
        Arrays.sort(input);
        Search search = new BinarySearch();
        search.search(input,34);
        System.out.println("compares"+search.getCompareCounter());
    }

    @Test(expected = NoSuchElementException.class)
    public void testNotFound() {
        int [] input = {4,56,2,12,34,45};
        Arrays.sort(input);
        Search search = new BinarySearch();
        search.search(input,35);
        System.out.println("compares"+search.getCompareCounter());

    }
}
