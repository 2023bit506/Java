import java.util.Scanner;
public class switchCase {

    public static String returnDays(int a)
    {
        if(a < 1 || a > 7 )
        {
            return "Invalid day number (must be between 1-7)";
        }
        switch(a){
            case 1:
            return "Monday";

            case 2:
            return "Tuesday";

            case 3:
            return "Wednsday";

            case 4:
            return "Thursday";

            case 5:
            return "Friday";

            case 6:
            return "Saturday";

            case 7:
            return "Sunday";

            default:
            return "Unknown day";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int a = sc.nextInt();

        String s1 = returnDays(a);
        System.out.println(s1);
        
    }
}
