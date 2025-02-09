

import java.util.ArrayList;
import java.util.Collection;

public class PractiseCollection {


    public static void main(String  args[]){

        Collection<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(29);
    
        for (int n : numbers){
            System.out.println(n);
        }

    }

}
