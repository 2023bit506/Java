/*class Ise1
{
    public Ise1()
    {
        // super();
        System.out.println("Hello");
    }
}



public class Ise2 extends Ise1
{
    Ise2()
    {
        // super();
        System.out.println("HEEYYY");
        super();
    }
    public static void main(String[] args) {
        Ise2 i1 = new Ise2();
    }
} */

class Ise1{
    static String name = "Hello";
    public Ise1()
    {
        System.out.println(this.name);
        // System.out.println(name);
    }
}

public class Ise2 extends Ise1
{
    public Ise2(String name)
    {
       System.out.println(Ise1.name);
    }
    public static void main(String[] args) {
        Ise2 i1 = new Ise2("Hii");
    }
}