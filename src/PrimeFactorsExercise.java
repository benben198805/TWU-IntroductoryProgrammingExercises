import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 16-6-11.
 */
public class PrimeFactorsExercise {

    private boolean isPrimer(int number){
        int index=2;
        while (index<number)
        {
            if (number%index==0){
                return false;
            }
            index++;
        }
        return true;
    }

    public List<Integer> generate(int number){
        List<Integer> result=new ArrayList<>();
        for(int index=2;index<=number;index++)
        {
            if(isPrimer(index)&&number%index==0){
                number/=index;
                result.add(index);
                index=2;
            }
        }
        return result;
    }
}
