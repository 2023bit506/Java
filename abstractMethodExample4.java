interface squareCube
{
    abstract int Cube(int n);
    int Square(int n);
}
public class abstractMethodExample4 implements squareCube
{
    public int Cube(int n)
    {
        return n*n*n;
    }
    public int Square(int n)
    {
        return n*n;
    }
    public static void main(String[] args)
    {
        abstractMethodExample4 e1 = new abstractMethodExample4();
        System.out.println(e1.Cube(10));
        System.out.println(e1.Square(5));
    }
}
