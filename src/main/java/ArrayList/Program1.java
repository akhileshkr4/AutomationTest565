package ArrayList;

import java.util.ArrayList;

public class Program1 {
    public static void main(String[]args)
    {
        ArrayList<String>Name=new ArrayList<String>();
        Name.add("AKHIELSH");
        Name.add("Manish");
        Name.add("Sohan");
        Name.add("Deepak");
        Name.add("Himanshu");
        Name.add(1,"Satish");
        Name.add(2,"Ankit");
        System.out.print(Name);//remove manish
        Name.remove(3);
        System.out.println(Name);
    }
}
