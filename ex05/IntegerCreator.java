package t_11_holdingYourObjects.ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class IntegerCreator {
    private final static Random rand = new Random(47);

    public Integer randomInteger()
    {
        return rand.nextInt();
    }

    public Integer[] createArray(int size)
    {
        Integer[] result = new Integer[size];
        for (int i = 0; i < size; i++)
            result[i] = randomInteger();
        return result;
    }

    public ArrayList<Integer> arrayList(int size)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
