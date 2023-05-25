package Exception;

public class Program1 {
    String name;
    public static void main(String[] args)
    {
        Program1 p=new Program1();
        p.name="AKHILESH";
        p=null;
        System.out.print(p.name);//null pointerExeption occurs



    }
}
