import java.util.ArrayList;
import java.util.PriorityQueue;

class bank{
    int a;
    int b;
    bank(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int rateofinterest(int a,int b)
    {
        return a+b;
    }
}
class axisbank extends bank{
    axisbank(int a, int b) {
        super(a, b);
    }

    int rateofinterest(int a, int b)
    {
        return a*b;
    }
}
class sBI extends bank{
    sBI(int a, int b) {
        super(a, b);
    }

    int rateofinterest()
    {
        return 25;
    }
}
public class methodoverride
{
    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<a.size();i++)
        {
            a.add(i+1);
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<10;i++)
        {
            if(a.get(i)>max1)
            {
                int temp=max1;
                max1=a.get(i);
                max3=max2;
                max2=temp;
            }
            if(a.get(i)<max1&&a.get(i)>=max2)
            {
                int temp=max2;
                max2=a.get(i);
                max3=temp;
            }
            if(a.get(i)<max2&&a.get(i)>=max1)
            {
                max3=a.get(i);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<a.size();i++)
        {
            pq.add(a.get(i));
        }
        int count=0;
        while(count<2)
        {
            pq.poll();
            count++;
        }
        int max=pq.poll();

    }
}
/*class shape
{
    int area()
    {
        System.out.println(4*4);
    }
}
class Rectangle extends shape

 */
