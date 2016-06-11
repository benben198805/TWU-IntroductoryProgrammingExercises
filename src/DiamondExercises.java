/**
 * Created by ben on 16-6-11.
 */
public class DiamondExercises {
    private final ConsolePrinter consolePrinter;

    public DiamondExercises(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public void printInMiddle(int count,int length){
        String result="";
        int middle=length%2==1?(length-1)/2+1:length/2;
        for(int index=0;index<length;index++)
        {
            if(index<middle-count||index>middle+count){
                result+=" ";
            }
            else{
                result+="*";
            }
        }
        consolePrinter.print(result);
    }

    public void drawIsoscelesTriangle(int number){
        int length=String.valueOf(number).length();
        for(int index=0;index<length;index++)
        {
            if(index%2==1){
                printInMiddle(index,length);
            }
        }
    }

}
