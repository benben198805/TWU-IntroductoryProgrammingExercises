import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


/**
 * Created by ben on 16-6-11.
 */
public class TriangleExercisesTest {
    private ConsolePrinter consolePrinter;
    private TriangleExercises triangleExercises;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public  void setUp(){
        consolePrinter = mock(ConsolePrinter.class);
        triangleExercises=new TriangleExercises(consolePrinter);

        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldReturnOneAsterisk() throws Exception {
        triangleExercises.drawOneAsterisk();

        verify(consolePrinter).print("*");
    }


    @Test
    public void shouldReturnFourAsteriskInALine() throws Exception {
        triangleExercises.drawAHorizontalLine(4);

        verify(consolePrinter).print("****");

    }


    @Test
    public void shouldReturnAVerticalLineWithFourHeight() throws Exception {

        triangleExercises.drawAVerticalLine(4);

        verify(consolePrinter,times(4)).print("*");
    }



    @Test
    public void shouldReturnFourHeightRightRriangle() throws Exception {

        triangleExercises.drawARightTriangle(4);
        verify(consolePrinter).print("*");
        verify(consolePrinter).print("**");
        verify(consolePrinter).print("***");
        verify(consolePrinter).print("****");
    }


}