// public class pattern2 {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row=1;row<=5;row++)
//         {
//             for(int column=1;column<= n-row+1;column++)
//             {
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }


public class pattern2{
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=0; j<2*i+1;j++)
            {
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}