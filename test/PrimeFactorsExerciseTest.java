import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ben on 16-6-11.
 */
public class PrimeFactorsExerciseTest {
    @Test
    public void shouldReturnZeroLength() throws Exception {

        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        List<Integer> primeList = primeFactorsExercise.generate(1);
        assertEquals(primeList.size(), 0);
    }

    @Test
    public void shoudReturnAListOf2_3_5() throws Exception {
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();

        List<Integer> primeList = primeFactorsExercise.generate(30);

        assertEquals(primeList.size(), 3);
        assertEquals(primeList.get(0), Integer.valueOf(2));
        assertEquals(primeList.get(1), Integer.valueOf(3));
        assertEquals(primeList.get(2), Integer.valueOf(5));

    }

    @Test
    public void shouldReturnZeroLengthWithNegativeInput() throws Exception {
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        List<Integer> primeList = primeFactorsExercise.generate(-1);
        assertEquals(primeList.size(), 0);
    }

    @Test
    public void shoudReturnAListOf7() throws Exception {
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        List<Integer> primeList = primeFactorsExercise.generate(5);

        assertEquals(primeList.size(), 1);
        assertEquals(primeList.get(0), Integer.valueOf(5));
    }

    @Test
    public void shoudReturnAListOf2_3_3() throws Exception {
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        List<Integer> primeList = primeFactorsExercise.generate(50);

        assertEquals(primeList.size(), 3);
        assertEquals(primeList.get(0), Integer.valueOf(2));
        assertEquals(primeList.get(1), Integer.valueOf(5));
        assertEquals(primeList.get(2), Integer.valueOf(5));

    }

}