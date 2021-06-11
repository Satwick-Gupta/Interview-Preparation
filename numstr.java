import java.util.HashMap;
import java.util.Scanner;

public class numstr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2="";
        int count=1;
        for(int i=1;i<s1.length();i++)
        {
            if(s1.charAt(i)==s1.charAt(i-1))
            {
                count++;
            }
            else
            {
                s2=s2+count+s1.charAt(i-1);
                count=1;
                if(i==s1.length()-1)
                {
                    s2=s2+count+s1.charAt(i);
                }

            }
        }
        if(count!=1)
        {
            s2=s2+count+s1.charAt(s1.length()-1);
        }

        System.out.println(s2);
    }
}
