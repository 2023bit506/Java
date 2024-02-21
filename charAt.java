import java.lang.String;

public class charAt
{
    public static void main(String[] args)
    {
        String s1 = "Shubham";
        char ch = s1.charAt(4);
        System.out.println(ch);
        System.out.println(s1.charAt(3));

        //Accessing First and Last Character by Using the charAt() Method

        String s2 = "Hello everyone welcome to my youtube channel";
        int length = s2.length();

        System.out.println("Char at index 0 is : "+ s2.charAt(0));
        System.out.println("Character at last index : "+s2.charAt(length-1));


        //Print Characters Presented at Odd Positions by Using the charAt() Method
        String s3 = "Hello everyone welcome to my youtube channel";
        for(int i=0;i<=s3.length()-1;i++)
        {
            if (i%2!=0) {
                System.out.println("Character at "+ i +" position is : "+s3.charAt(i));    
            }
        }
    }    
    
    
}