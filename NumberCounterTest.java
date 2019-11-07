import org.junit.Test;

import static org.junit.Assert.*;

public class NumberCounterTest {

    @Test
    public void initializeTable() {

        NumberCounter numberCounter = new NumberCounter();
        int [] numbers =numberCounter.initializeTable(20, 6);


        for (int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println(numberCounter.findMaxNumberOccurs(numbers));
    }

    @Test
    public void findMaxNumberOccurs() {
    }
}
