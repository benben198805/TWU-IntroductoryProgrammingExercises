/**
 * Created by ben on 16-6-11.
 */
public class DiamondExercises {
    private final ConsolePrinter consolePrinter;

    public DiamondExercises(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public void printInMiddle(int count,int length){
        String result="*";
        while (result.length()<=length)
        {
            if(count>1)
            {
                result="*"+result+"*";
            }else
            {
                result=" "+result+" ";
            }
            count--;
        }

        consolePrinter.print(result);
    }

    public void drawIsoscelesTriangle(int number){
        for(int index=1;index<=number;index++)
        {
            printInMiddle(index,number);
        }
    }

    public void drawDiamond(int number){
        int index=1;
        while (index<=number)
        {
            printInMiddle(index,number);
            index++;
        }
        index=number-1;
        while (index>0)
        {
            printInMiddle(index,number);
            index--;
        }
    }

    public void drawDiamondWithName(int number){
        int index=1;
        while (index<=number-1)
        {
            printInMiddle(index,number);
            index++;
        }
        consolePrinter.print("ben");
        index=number-1;
        while (index>0)
        {
            printInMiddle(index,number);
            index--;
        }
    }



}
