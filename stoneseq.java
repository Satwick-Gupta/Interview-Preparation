import java.util.Scanner;

public class stoneseq {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        System.out.println(s2.length());
        int pos=0;
        int i=0;
        int j=0;
        while(j<(s2.length()))
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;

            }

            j++;
        }
        System.out.println(i+1);

    }
}
