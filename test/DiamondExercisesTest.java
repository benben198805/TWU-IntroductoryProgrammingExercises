import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ben on 16-6-11.
 */
public class DiamondExercisesTest {
    private ConsolePrinter consolePrinter;
    private DiamondExercises diamondExercises;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public  void setUp(){
        consolePrinter = mock(ConsolePrinter.class);
        diamondExercises=new DiamondExercises(consolePrinter);

        System.setOut(new PrintStream(outContent));
    }


    public void shouldReturnIsoscelesTriangle() throws Exception {
        diamondExercises.drawIsoscelesTriangle(3);

        verify(consolePrinter).print("  *  ");
        verify(consolePrinter).print(" *** ");
        verify(consolePrinter).print("*****");
    }

}