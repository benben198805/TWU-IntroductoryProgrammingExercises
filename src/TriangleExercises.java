/**
 * Created by ben on 16-6-11.
 */
public class TriangleExercises {
    private final ConsolePrinter consolePrinter;

    public TriangleExercises(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public void drawOneAsterisk(){
        consolePrinter.print("*");
    }


    public void drawAHorizontalLine(int number){
        String result="";
        for (int index=0;index<number;index++)
        {
            result+="*";
        }
        consolePrinter.print(result);
    }


    public void drawAVerticalLine(int number){
        for (int index=0;index<number;index++)
        {
            consolePrinter.print("*");
        }
    }

    public void drawARightTriangle(int number){
        for (int index=1;index<=number;index++)
        {
            drawAHorizontalLine(index);
        }
    }
}
