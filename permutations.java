import java.util.*;
public class permutations {
    public static String swap(String str,int i,int j)
    {
        char arr[]=str.toCharArray();

        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);

    }
    public static void perm(String str,int l,int r)
    {
        if(l==r)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                str=swap(str,l,i);
                perm(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        perm(s1,0,s1.length()-1);

    }
}

