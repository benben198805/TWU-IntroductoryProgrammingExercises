import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

/**
 * Created by ben on 16-6-11.
 */
public class FizzBuzzExerciseTest {

    private ConsolePrinter consolePrinter;
    private FizzBuzzExercise fizzBuzzExercise;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private InOrder inOrder;


    @Before
    public  void setUp(){
        consolePrinter = mock(ConsolePrinter.class);
        fizzBuzzExercise=new FizzBuzzExercise(consolePrinter);
        inOrder=inOrder(consolePrinter);
    }

    @Test
    public void shouldReturnFizzBuzzResult() throws Exception {
        fizzBuzzExercise.fizzBuzz(15);


        inOrder.verify(consolePrinter,times(1)).print("1");
        inOrder.verify(consolePrinter,times(1)).print("2");
        inOrder.verify(consolePrinter,times(1)).print("Fizz");
        inOrder.verify(consolePrinter,times(1)).print("4");
        inOrder.verify(consolePrinter,times(1)).print("Buzz");
        inOrder.verify(consolePrinter,times(1)).print("Fizz");
        inOrder.verify(consolePrinter,times(1)).print("7");
        inOrder.verify(consolePrinter,times(1)).print("8");
        inOrder.verify(consolePrinter,times(1)).print("Fizz");
        inOrder.verify(consolePrinter,times(1)).print("Buzz");
        inOrder.verify(consolePrinter,times(1)).print("11");
        inOrder.verify(consolePrinter,times(1)).print("Fizz");
        inOrder.verify(consolePrinter,times(1)).print("13");
        inOrder.verify(consolePrinter,times(1)).print("14");
        inOrder.verify(consolePrinter,times(1)).print("FizzBuzz");
    }

}