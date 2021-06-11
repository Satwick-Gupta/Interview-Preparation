import java.util.*;
public class LTI2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int a=s.nextInt();
        int count=0;
        String s2="";

        for(int i=0;i<s1.length();i++)
        {
            String temp=s2+s1.charAt(i);
            if(Integer.parseInt(temp)<a)
            {
                s2=temp;
            }
            else
            {
                count=count+1;
                s2="";
                s2=s2+s1.charAt(i);
            }

        }
        count++;
        System.out.println(count);
    }
}
