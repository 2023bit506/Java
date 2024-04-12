// abstract class Solution
// {
//     public abstract void getData();
//     abstract void printData();
// }


// public class abstractMethodExample3 {
//     void getData()
//     {
//         System.out.println("My name is SGGS");
//     }
//     void printData()
//     {
//         System.out.println("Hello");
//     }

//     public static void main(String[] args)
//     {
//         abstractMethodExample3 ame3 = new abstractMethodExample3();
//         ame3.getData();
//         ame3.printData();
//     }
// }

interface ITClass
{
    abstract void Name();
}
interface Student extends ITClass
{
    abstract void Roll();
}
class abstractMethodExample3 implements Student
{
    public void Name()
    {
        System.out.println("Shubham");
    }
    public void Roll()
    {
        System.out.println("206059");
    }
    public static void main(String[] args) {
        abstractMethod3 e1 = new abstractMethod3();
    }
}
