import java.util.Scanner;

public class wins {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int c=0;
        int m=0;

        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int x=s.nextInt();
            int y=s.nextInt();
            int z=s.nextInt();

            System.out.println(c);
        }

    }
    static int gameOfCoins(int T,int [][]games) {
        int c = 0;
        int m = 0;

        for (int i = 0; i < T; i++) {

            int n = games[i][0];
            int x = games[i][1];
            int y = games[i][2];
            int z = games[i][3];
            if (n > x + y) {
                m = (z == 1) ? 0 : 1;
                c = c + m;
            } else {
                m = (z == 1) ? 1 : 0;
                c = c + m;
            }

        }
        return c;
    }


}
