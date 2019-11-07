import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDimentionalArrayTest {

    @Test
    public void getRowNumberWithMinimumValue() {

        int input[][] = {
                         {4,5,6},
                         {4,6,8},
                {0,1,2},};

        TwoDimentionalArray twoDimentionalArray = new TwoDimentionalArray();

        System.out.println(twoDimentionalArray.getRowNumberWithMinimumValue(input));
    }


    @Test
    public void getRowNumberWithSameValues() {
        int input[][] = {
                {4,5,6},
                {4,6,6},
                {3,3,3}};

        TwoDimentionalArray twoDimentionalArray = new TwoDimentionalArray();
        System.out.println(twoDimentionalArray.getRowNumberWithSameValues(input));
    }
}
