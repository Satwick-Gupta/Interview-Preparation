import java.util.*;
public class countoccurencesofanagrams {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String ptr=s.next();
        int K=ptr.length();
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<ptr.length();i++)
        {
            if(h.containsKey(ptr.charAt(i)))
            {
                int a=h.get(ptr.charAt(i));
                a++;
                h.put(ptr.charAt(i),a);
            }
            else
            {
                h.put(ptr.charAt(i),1);
            }
        }

        int i=0;
        int j=0;
        int count=h.size();
        int total=0;
        while(j<str.length())
        {
            if(h.containsKey(str.charAt(j))) {

                int a = h.get(str.charAt(j));
                a--;
                if (a == 0) {
                    count--;
                }
                h.put(str.charAt(j), a);
            }
            System.out.println(h+" "+count);
            if((j-i+1)<K)
            {
                j++;
            }
            else if((j-i+1)==K)
            {
                if(count==0)
                {
                    total++;
                }
                if(h.containsKey(str.charAt(i)))
                {
                    int a=h.get(str.charAt(i));
                    a++;
                    if(a>0)
                    {
                        count++;
                    }
                    h.put(str.charAt(i),a);
                   
                    System.out.println(h);
                }
                i++;
                j++;
            }
        }

        System.out.println(total);

    }
}
