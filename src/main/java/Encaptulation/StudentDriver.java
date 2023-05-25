package Encaptulation;

public class StudentDriver {
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.setName("Akhilesh");
        System.out.println(s1.getName());
        s1.setAge(25);
        s1.setRollNo(34435435);
        s1.setAddress("New Delhi");
        System.out.println(s1.getAge());
        System.out.println("the student addres is:"+s1.getAddress());
        System.out.println(s1.getRollNo());
    }
}
