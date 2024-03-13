class Constructor1
{
    Constructor1(){
        System.out.println("Hello World");
    }
    Constructor1(int x){
        System.out.println("Hello Shubham");
    }
    public static void main(String[] args) {
        Constructor1 s1 = new Constructor1();
        Constructor1 s2 = new Constructor1(10);
    }
}