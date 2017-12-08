import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinarySearch implements Search {

    private int stepCounter;

    public boolean findElement(int value, int[] input) throws NoSuchElementException {
        Arrays.sort(input);

        for (int i=0;i<input.length;i++) {
            System.out.print(" " + input[i]);
        }
        System.out.println();

        int index = search(input, 0, input.length-1, value);
        if (index>-1) {
            return true;
        } else {
            throw new NoSuchElementException("There is no element "+value);
        }

    }

    private int search(int[] input, int leftIndex, int rightIndex, int searchValue)  {
        if (rightIndex>=leftIndex) {
            stepCounter++;
            int middleIndex = leftIndex + (rightIndex-leftIndex)/2;
            int middleValue = input[middleIndex];

            if (middleValue==searchValue)
                return middleIndex;

            if (middleValue>searchValue) {
                return search(input, leftIndex, middleIndex-1, searchValue);
            } else {
                return search(input, middleIndex + 1, rightIndex, searchValue);
            }

        }
        // no element found
        return -1;
    }

    public int getStepCounter() {
        return stepCounter;
    }
}
