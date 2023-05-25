package Array;

public class ArrayPrintEvenIndex {

    public static void main(String[] args)
    {
        int[]a= new int[10];
        a[0]=10;
        a[1]=12;
        a[3]=13;
        a[4]=15;
        a[5]=16;
        a[6]=32;
        a[7]=14;
        a[8]=34;
        a[9]=22;
        for(int i=0;i<a.length;i++)
        {
           if(i%2==0)
           {
               System.out.print(a[i]+" " );
           }
           else
           {
               System.out.println(a[i]+" ");
           }
        }
    }
}
