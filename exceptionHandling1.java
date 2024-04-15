public class exceptionHandling1 {
    
    public void display()
    {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
        }
        catch(Exception e)
        {
            System.out.println("Arithmetic Exception");
        }
        
    }
    public static void main(String[] args) {
        exceptionHandling1 ex1 = new exceptionHandling1();
        ex1.display();
    }    
}
