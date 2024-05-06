public class abstractMethod
{
    public void show()
    {
        System.out.println("Heiieie");
    }
    public static void main(String[] args) {
        abstractMethod ab1 = new abstractMethod();
        ab1.show();
        abstractMethod3 ab3 = new abstractMethod3();
        ab3.display();

    }
} 
abstract class abstractMethod2
{
    abstract void display();
}

class abstractMethod3 extends abstractMethod2 {
    
    public void  display()
    {
        System.out.println("Hello Shubham");
    }
    
}

