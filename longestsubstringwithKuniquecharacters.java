import java.util.*;
public class longestsubstringwithKuniquecharacters {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={1,1,2,3,3,4,5,7,7,7,8,9};
        int K=3;
        HashMap<Integer,Integer> h=new HashMap<>();
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        while(i<a.length)
        {
            if(j<a.length&&h.size()<=K)
            {
                if(h.size()!=K)
                {
                    if(h.containsKey(a[j]))
                    {
                        h.put(a[j],h.get(a[j])+1);
                    }
                    else
                    {
                        h.put(a[j],1);
                    }
                    j++;
                }
                else
                {
                    int count=0;
                    Iterator itr=h.entrySet().iterator();
                    while(itr.hasNext())
                    {
                        count=count+(int)h.get(itr.next());
                    }
                    if(max<count)
                    {
                        max=count;
                    }
                    j++;
                }
            }
            else
            {
                h.clear();
                i++;
                j=i;
            }
        }
        System.out.println(max);
    }
}
