import java.util.*;
public class balaji2 {
    public static void main(String[]x)
    {
        Scanner s=new Scanner(System.in);
        String  a=s.nextLine();
        Stack<Integer> s1=new Stack<Integer>();
        for(int i=0;i<a.length();i++) {
            if (s1.isEmpty()) {
                int val=a.charAt(i)-'0';
                s1.push(val);

            } else {
                if ((s1.peek() + Character.getNumericValue(a.charAt(i)) )== 17) {
                    s1.pop();
                }
                else
                {
                    s1.push(a.charAt(i)-'0');
                }
            }
        }

       System.out.println(s1.size()) ;
    }
}
