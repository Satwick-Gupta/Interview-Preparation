import java.util.*;
public class number {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count=0;
        int t=s.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=s.nextInt();
        }
        int p1=s.nextInt();
        int p2=s.nextInt();
        for(int i=0;i<t;i++)
        {
            if(p1%arr[i]==0&&p2%arr[i]==0)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}