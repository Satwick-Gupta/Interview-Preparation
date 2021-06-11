import java.util.Scanner;

public class GFG
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int count=0;
        String bin=Integer.toBinaryString(a);
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
   