import java.util.Scanner;

public class pradeep2 {
    static int out(int n,int val)
    {
        if(n==0)
        {
            return -1;
        }
        else if(n==1)
        {
            return 2;
        }

        return 0;

    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int val=5;
        System.out.println(out(n,5));
    }
}
