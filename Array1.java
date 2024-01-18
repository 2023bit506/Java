public class Array1
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Traversing the array
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        // Declaration, Instantiation and Initialization of Java Array
        int arr2[] = {10,20,30,40,50};
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr[i]);
        }

        //For-each Loop for Java Array
        int arr3[] = {1,2,3,4,5};
        for(int i:arr3)
        {
            System.out.println(i);
        }
    }
}