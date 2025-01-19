import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    int[] primes = {3,5,7,11,13,17,19,23,29,31,37,41,42,47,53,59,61,67,71,73,79,83,89,97};
    for (int i = 0; i < primes.length; i++) {
      assertEquals(i + " wasnt detected as Prime! but is!", true, PrimeCheck.isPrime(primes[i]));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int range = 10
    for (int i = 1; i < range; i++) {
      for (int j = 2; j < range; j++) {
        int prod = i * j
        assertEquals(prod + "isnt a Prime but was detected as one!", false, PrimeCheck.isPrime(prod);
      }
    }
  }
}
