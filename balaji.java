import java.util.*;
public class balaji{
    public static void main(String []x)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int count=0;
    for(int i=0;i<=n;i++)
    {
        if(i<10)
        {
            count++;
        }
        else
        {
            String s1=String.valueOf(i);
            int j=0;
            for( j=0;j<s1.length()-1;j++) {
                if (s1.charAt(j + 1) <=s1.charAt(j)) {
                    continue;
                } else {
                    break;
                }
            }
                if(j==s1.length()-1)
                {
                    count++;
                }
            }
        }
    System.out.println(count);
    }
}
