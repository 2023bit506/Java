abstract class studentInfo
{
    abstract void Name();
    abstract void Roll();
}
class Student1 extends studentInfo
{
    public void Name()
    {
        System.out.println("Hello Shubham");
    }
    public void Roll()
    {
        System.out.println("206059");
    }
}
class Student2 extends studentInfo
{
    public void Name()
    {
        System.out.println("Hello Pavan");
    }
    public void Roll()
    {
        System.out.println("206058");
    }
}

public class studentData {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.Name();
        s1.Roll();
        Student2 s2 = new Student2();
        s2.Name();
        s2.Roll();
    }
}
