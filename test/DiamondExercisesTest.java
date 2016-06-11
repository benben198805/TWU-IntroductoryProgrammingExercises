import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by ben on 16-6-11.
 */
public class DiamondExercisesTest {
    private ConsolePrinter consolePrinter;
    private DiamondExercises diamondExercises;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private InOrder inOrder;

    @Before
    public  void setUp(){
        consolePrinter = mock(ConsolePrinter.class);
        diamondExercises=new DiamondExercises(consolePrinter);
        inOrder=inOrder(consolePrinter);

        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldReturnIsoscelesTriangle() throws Exception {
        diamondExercises.drawIsoscelesTriangle(3);

        verify(consolePrinter).print("  *  ");
        verify(consolePrinter).print(" *** ");
        verify(consolePrinter).print("*****");
    }


    @Test
    public void shouldReturnDiamond() throws Exception {
        diamondExercises.drawDiamond(3);

        inOrder.verify(consolePrinter,times(1)).print("  *  ");
        inOrder.verify(consolePrinter,times(1)).print(" *** ");
        inOrder.verify(consolePrinter,times(1)).print("*****");
        inOrder.verify(consolePrinter,times(1)).print(" *** ");
        inOrder.verify(consolePrinter,times(1)).print("  *  ");
    }


    @Test
    public void shouldReturnDiamondWithName() throws Exception {
        diamondExercises.drawDiamondWithName(3);

        inOrder.verify(consolePrinter,times(1)).print("  *  ");
        inOrder.verify(consolePrinter,times(1)).print(" *** ");
        inOrder.verify(consolePrinter,times(1)).print("ben");
        inOrder.verify(consolePrinter,times(1)).print(" *** ");
        inOrder.verify(consolePrinter,times(1)).print("  *  ");
    }

}