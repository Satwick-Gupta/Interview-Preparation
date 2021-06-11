import java.util.*;
public class maxofsubarray {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int a[]={1,3,-1,-3,5,3,6,7};
      int K=3;
      int i=0;
      int j=0;
      Queue<Integer> S=new LinkedList<Integer>();
      int max=Integer.MIN_VALUE;
      while(j<a.length)
      {
          if(S.isEmpty()||S.peek()<a[j])
          {
              while(!S.isEmpty()&&S.peek()<a[j])
              {
                  S.poll();
              }
              S.add(a[j]);
          }
          else if(S.peek()>a[j])
          {
              S.add(a[j]);
          }
          if((j-i+1)!=K)
          {
              j++;
          }
          else
          {
              System.out.println(S.peek());
              if(a[i]==S.peek()) {
                  S.poll();
              }

              i++;
              j++;
          }

      }
    }
}
