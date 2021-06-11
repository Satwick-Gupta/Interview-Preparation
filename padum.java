import java.util.*;
public class padum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(j==i-1) {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i+""+'*');
                }
            }
            System.out.println(" ");
        }
    }
}
