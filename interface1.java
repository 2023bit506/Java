interface bike
{
    void Name();
    void Price();
}
interface car
{
    void Name2();
    void price2();
}

class bikecar implements bike , car{
    public void Name()
    {
        System.out.println("MT15");
    }
    public void Price()
    {
        System.out.println("1500000");
    }
    public void Name2()
    {
        System.out.println("Bolero");
    }
    public void price2()
    {
        System.out.println("20000000");
    }
}

public class interface1
{
    public static void main(String[] args) {
        bikecar b2 = new bikecar();
        b2.Name();
        b2.Name2();
        b2.Price();
        b2.price2();
    }
}
