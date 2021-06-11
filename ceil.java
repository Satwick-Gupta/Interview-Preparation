import java.util.*;
public class ceil {
    public static int magic(int a)
    {
        return a*a;
    }
    public static int perform(int a,int b)
    {
        while(b<a+a)
        {
            b=magic(b);
            b=b+2;
            break;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=7358;
        int b=21;
        while(b!=0)
        {
            int c=a%100;
            c=c*100;
            int d=a/100;
            a=c+d;
            b--;
        }
        System.out.println(a);

    }
}
