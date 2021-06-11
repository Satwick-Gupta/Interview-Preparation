import java.util.*;
public class lpsubstring {
    public static boolean isPalindrome(String s1,int i,int j)
    {
        while(i<j)
        {
            if(s1.charAt(i)!=s1.charAt(j))
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
    public static int longestpalindrome(String s1,int i,int j)
    {

        while(i<j) {
            if (isPalindrome(s1, i, j)) {
                System.out.println(s1.substring(i,j+1));
                return j-i+1;
            }
            else {
                i++;
                j--;
             return longestpalindrome(s1,i,j);
            }
        }
        return 0;
    }
    public static void main(String[] x)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println(longestpalindrome(s1,0,s1.length()-1));
    }
}
