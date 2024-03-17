class parentClass
{
    int a = 10;
    int b = 20;
    public void Sub()
    {
        System.out.println(a-b);
    }
}

public class childClass extends parentClass {
    int c = 10;
    int d = 15;

    public void Add()
    {
        System.out.println(c+d);
    }

    public static void main(String[] args) {        
        // parentClass p2 = new childClass();
        // p2.Sub();

        // childClass p3 = new childClass();
        // p3.Add();
        // p3.Sub();

        parentClass p1 = new parentClass();
        p1.Sub();
        // p1.Add(); 

        childClass p2 = new childClass();
        p2.Add();
        p2.Sub();

        parentClass p3 = new childClass();
        p3.Sub();
        
        //If we want to access child class method from parent class then use method overriding otherwise it will not possible.

    }
}
