package t_11_holdingYourObjects.ex05;

import java.util.ArrayList;

public class Integers {
    public static final IntegerCreator creator = new IntegerCreator();

    public static Integer randomInteger()
    {
        return creator.randomInteger();
    }

    public static Integer[] createArray(int size)
    {
        return creator.createArray(size);
    }

    public static ArrayList<Integer> arrayList(int size)
    {
        return creator.arrayList(size);
    }
}
