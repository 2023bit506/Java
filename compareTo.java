import java.lang.String;


// The Java String class compareTo() method compares the given string with the current string lexicographically. It returns a positive number, negative number, or 0.
/* if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0 */ 

public class compareTo
{
    public static void main(String[] args)
    {
        //****Java String compareTo() Method Example
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Shubham";
        String s4 = "New";

        System.out.println(s1.compareTo(s2));  //0
        System.out.println(s1.compareTo(s3));  //-11
        System.out.println(s1.compareTo(s4));  //-5
        System.out.println(s2.compareTo(s1));  //0
        System.out.println(s2.compareTo(s3));  //-11   
        System.out.println(s2.compareTo(s4));  //-6
        System.out.println(s3.compareTo(s1));  //11   
        System.out.println(s3.compareTo(s4));  //5


        //****Java String compareTo(): empty string

        //When we compare two strings in which either first or second string is empty, the method returns the length of the string.
        //If first string is an empty string, the method returns a negative
        //If second string is an empty string, the method returns a positive number that is the length of the first string.

        String s5 = "Ram";
        String s6 = "";
        System.out.println(s5.compareTo(s6));

        //****Java String compareTo(): case sensitive
        /*Now, let's break down the difference between the two strings:
        The Unicode value of 'I' (uppercase) is 73.
        The Unicode value of 'i' (lowercase) is 105.
        The difference is 105 - 73 = 32. 
        However, because the uppercase string is considered smaller in lexicographical order, the result is negated. 
        Therefore, the result of st1.compareTo(st2) is -32. */

        String s7 = "Shubham Pawar";
        String s8 = "SHUBHAM PAWAR";
        System.out.println(s7.compareTo(s8));


    }
}