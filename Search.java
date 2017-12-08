import java.util.NoSuchElementException;

public interface Search {

    // find value in input table
    public boolean findElement(int value, int [] input) throws NoSuchElementException;

    public int getStepCounter();
}
