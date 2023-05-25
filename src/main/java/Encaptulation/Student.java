package Encaptulation;

public class Student {

    private String name;
    private int age;
    private String address;
    private int rollNo;

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAddress()
    {
        return address;
    }
    public int getRollNo()
    {
        return rollNo;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setRollNo(int rollNo)
    {
        this.rollNo=rollNo;
    }

}
