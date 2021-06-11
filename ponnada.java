import java.util.Scanner;

public class ponnada {
    public static void main(String []x)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int a=s.nextInt();
        int i=0;
        int j=1;
        String s2=s1.substring(i,j);


        int count=0;
        while(j<s1.length())
        {
            int b=Integer.parseInt(s2);
            if(b>a)
            {
                count++;
                i=j-1;
                j++;
                s2=s1.substring(i,j);
            }
            else
            {
                j++;
                s2=s1.substring(i,j);

            }
            System.out.println(s2);



        }
        System.out.println(count);
    }
}
