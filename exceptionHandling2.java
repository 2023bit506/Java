public class exceptionHandling2 {
    public void display()
    {
        try{
        String s1 = null;
        System.out.println(s1.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Pointer Exception");
        }
    }
    public static void main(String[] args) {
        exceptionHandling2 ex2 = new exceptionHandling2();
        ex2.display();
    }
}
