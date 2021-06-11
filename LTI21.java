import java.util.Scanner;

public class LTI21 {
    public static int min1=Integer.MAX_VALUE;
    public static boolean isPrime(int n)
    {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {

            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }

    public static boolean isValid(int i,int j,int [][]input3)
    {
        if(i>=0&&i<input3.length&&j<input3[0].length&&j>=0)
        {
            return true;
        }
        return false;
    }
     public static int reach(int i,int j,int [][]input3,int len,int val,boolean visited[][])
     {
         if(input3[i][j]==val) {

             System.out.println(i+"     "+j);
             if (len < min1 && isPrime(len)) {
                 min1=len;
                 System.out.println(min1+"     "+min1);
             }

         }
         if(isValid(i+1,j,input3)&&input3[i+1][j]!=2&&visited[i+1][j]==false)
         {
             System.out.println(i+1+" "+j);
             visited[i+1][j]=true;
             reach(i+1,j,input3,len+1,val,visited);
         }
         if(isValid(i,j+1,input3)&&input3[i][j+1]!=2&&visited[i][j+1]==false)
         {
             System.out.println(i+ " "+(j+1));
             visited[i][j+1]=true;
             reach(i,j+1,input3,len+1,val,visited);
         }
         if(isValid(i-1,j,input3)&&input3[i-1][j]!=2&&visited[i-1][j]==false)
         {
             System.out.println(i-1+" "+j);
             visited[i-1][j]=true;
             reach(i-1,j,input3,len+1,val,visited);
         }
         if(isValid(i,j-1,input3)&&input3[i][j-1]!=2&&visited[i][j-1]==false)
         {
             System.out.println(i+" "+(j-1));
             visited[i][j-1]=true;
             reach(i,j-1,input3,len+1,val,visited);
         }

         return min1;
     }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input1= 5;
        int input2=5;
        boolean visited[][]=new boolean[input1+1][input2+1];
        int input3[][]={{1,2,1,1,2,1},{2,1,2,1,1,0},{1,1,3,1,2,1},{1,2,1,0,1,2},{0,1,2,1,2,1},{0,0,1,0,1,0}};
        System.out.println(reach(input1,0,input3,0,3,visited));


    }
}
