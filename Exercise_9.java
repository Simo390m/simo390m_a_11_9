import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise_9

{
    public boolean hasEven (Set<Integer> set1 )
    {
        List<Integer> tempList = new ArrayList<>();
        tempList.addAll(set1);
        boolean hasAnEven = false;

        for (Integer number: tempList)
        {
            if (number%2==0)
            {
                hasAnEven = true;
            }
        }



        return hasAnEven;
    }


    public static void main(String[] args)
    {
        Exercise_9 exercise_9 = new Exercise_9();
        Set<Integer> set = new HashSet<>();
        Set<Integer> setNoEven = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(11);
        set.add(9);
        set.add(13);
        set.add(15);
        set.add(17);

        setNoEven.add(1);
        setNoEven.add(1);
        setNoEven.add(1);
        setNoEven.add(1);
        setNoEven.add(1);
        setNoEven.add(1);
        setNoEven.add(1);
        setNoEven.add(1);

        System.out.println(exercise_9.hasEven(set));

        //Test with set NOT containing even value :
        System.out.println(exercise_9.hasEven(setNoEven));


    }
}
