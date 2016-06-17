import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static sun.nio.cs.Surrogate.is;

public class PrimeFactorsExerciseTest {
    @Test
    public void shouldReturnZeroLength() throws Exception {
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        List<Integer> primeList = primeFactorsExercise.generate(1);

        assertEquals(primeList.size(), 0);
    }

    @Test
    public void shoudReturnAListOfTwoAndThreeAndFive() throws Exception {
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        List<Integer> primeList = primeFactorsExercise.generate(30);

        assertEquals(primeList.size(), 3);
        assertEquals(primeList.get(0), is(2));
        assertEquals(primeList.get(1), is(3));
        assertEquals(primeList.get(2), is(5));

    }

    @Test
    public void shouldReturnZeroLengthWithNegativeInput() throws Exception {
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        List<Integer> primeList = primeFactorsExercise.generate(-1);

        assertEquals(primeList.size(), 0);
    }

    @Test
    public void shoudReturnAListOfFive() throws Exception {
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        List<Integer> primeList = primeFactorsExercise.generate(5);

        assertEquals(primeList.size(), 1);
        assertEquals(primeList.get(0), is(5));
    }

    @Test
    public void shoudReturnAListOfTwoAdnFiveAndFive() throws Exception {
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        List<Integer> primeList = primeFactorsExercise.generate(50);

        assertEquals(primeList.size(), 3);
        assertEquals(primeList.get(0), is(2));
        assertEquals(primeList.get(1), is(5));
        assertEquals(primeList.get(2), is(5));

    }

}