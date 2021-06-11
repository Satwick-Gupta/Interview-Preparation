import java.util.*;
public class maxsumsubarrayofsumK {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={10, 5, 2, 7, 1, 9 };
        int K=15;
        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(i<a.length)
        {
            if(j<a.length) {

                sum = sum + a[j];

                if (sum != K) {
                    j++;
                }
                else
                {
                    if(max<(j-i+1))
                    {
                        max=(j-i+1);
                    }
                    j++;

                }
            }
            else
            {
                sum=0;
                i++;
                j=i;
            }

        }
        System.out.println(max);
    }
}
