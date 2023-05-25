package ArrayList;

import java.util.ArrayList;

public class Program2 {
    public static void main(String[]args)
    {
        ArrayList<Integer>a=new ArrayList<Integer>(200);
        a.add(23);
        a.add(22);
        a.add(50);
        a.add(15);
        a.add(45);
        a.add(1,34);
        a.add(3,100);
        System.out.print(a.size());
        for(Integer i:a)
        {
            System.out.println(a.get(i));
        }
    }
}
