import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void isNotPrime() {
        PrimeNumber primeNumber = new PrimeNumber();
        Assert.assertEquals(false,primeNumber.isPrime(10));
    }

    @Test
    public void isPrime() {
        PrimeNumber primeNumber = new PrimeNumber();
        Assert.assertEquals(true,primeNumber.isPrime(7));
    }
}
