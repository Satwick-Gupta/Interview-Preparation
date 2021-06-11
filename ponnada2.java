import java.util.Scanner;

public class ponnada2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            int j=26-((int)s1.charAt(i)-'a');
            System.out.println(j);
            s2=s2+(char)(j+'a'-1);

        }
        System.out.println(s2);
    }
}
