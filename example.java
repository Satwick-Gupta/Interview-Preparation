public class example {
    public static int a;
    public static int b;
    public static int  get()
    {
        a=10;
        b=20;
        return a;
    }

}
class B
{
    example obj=new example();
    int a=obj.get();

    void sum()
    {
        int c=obj.b;
        System.out.println(c);
    }
}
class method {
    public static void main(String[] x) {

        B obj2 = new B();
        obj2.sum();
    }
}
