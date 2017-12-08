import java.util.NoSuchElementException;

public class LinearSearch implements Search {

    private int stepCounter;

    public boolean findElement(int value, int[] input) throws NoSuchElementException {
        for (int i=0;i<input.length;i++) {
            stepCounter++;
            if (input[i]==value) {
                return true;
            }
        }
        throw new NoSuchElementException("There is no value "+value+ " in table");
    }

    public int getStepCounter() {
        return stepCounter;
    }
}
