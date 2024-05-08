public class finalKeyword {
    final int a = 10;    
    final static String s1 = "ABCD";
    public void display()
    {
        a = 90;                  //error: cannot assign a value to final variable a
        s1 = "Shubham";         //error: cannot assign a value to static final variable s1
        System.out.println(a);
        System.out.println(s1);
    }
    public static void main(String[] args)
    {
        finalKeyword f1 = new finalKeyword();
        f1.display();
    }
}
