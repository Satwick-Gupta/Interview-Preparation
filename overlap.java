import java.util.Scanner;
public class overlap {
    public static void main(String []x)
    {
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        int count1=a[1]-a[0];
        int count2=a[3]-a[2];
        int count3=0;

            for(int i=a[2];i<=a[3];i++)
            {
                for(int j=a[0];j<=a[1];j++)
                {
                    if(i==j)
                    {
                        count3++;
                    }
                }
            }

        if(count3<a[4])
        {
            System.out.println(false);
        }
        else
        {
            System.out.println(true);
        }
    }
}
