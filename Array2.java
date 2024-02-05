// public class Array2 
// {
//     static void min(int arr[])
//     {
//         int min = arr[0];
//         for(int i=0;i<arr.length;i++)
//         {
//             if (min>arr[i]) 
//             {
//                 min =  arr[i];
//                 System.out.println(min);    
//             }
//         }
        
//     } 
    
//     public static void main(String[] args)
//         {
//             int arr[] = {33,34,35,7,8,9};
//             min(arr);
//         }
// }

public class Array2
{
    static void min(char arr[])
    {
        int counter = 0;
        char min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            counter++;
            if (min == arr[i]) 
            {
                min = arr[i];
                System.out.println(min);    
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args)
    {
        char arr[] = {'S','G','G','S','S'};
        min(arr);
    

    }
}

