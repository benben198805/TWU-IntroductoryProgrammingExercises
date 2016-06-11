/**
 * Created by ben on 16-6-11.
 */
public class FizzBuzzExercise {
    private final ConsolePrinter consolePrinter;

    public FizzBuzzExercise(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public void fizzBuzzPrint(int number){
        String result="";
        if(number%3==0){
            result+="Fizz";
            if(number%5==0){
                result+="Buzz";
            }
        }else if(number%5==0){
            result="Buzz";
        }else{
            result=String.valueOf(number);
        }
        consolePrinter.print(result);
    }

    public void fizzBuzz(int number){
        int index=1;
        while (index<=number){
            fizzBuzzPrint(index);
            index++;
        }

    }
}
