



/*Example:

        MAX allowed per day - 2
        28th Dec 10:00 AM - Bajaj alliance,1000,debit - success
        28th Dec 10:30 AM - Bajaj alliance,1000,credit - success
        28th Dec 10:30 AM - Zomato,5000,debit - success
        28th Dec 10:30 AM - Zomato,5000,debit - success
        28th Dec 11:30 AM - Zomato,5000,debit - no of tx limit exceeded
        29th Dec 00:01 AM - Zomato,5000,debit - success  */





import java.util.*;
public class maxtransaction {
    static class pair
    {
        int day;
        int count;
        pair(int day,int count)
        {
            this.day=day;
            this.count=count;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int maxtrans=s.nextInt();
        HashMap<String,pair> h=new HashMap<String,pair>();
        for(int i=0;i<t;i++)
        {

            int day=s.nextInt();
            s.nextLine();
            String merchant=s.nextLine();
            String trans=s.nextLine();

            if(trans.equals("debit"))
            {

                if(h.containsKey(merchant))
                {

                    if(((h.get(merchant).count)+1)<=maxtrans)
                    {

                        pair p1=h.get(merchant);
                        int a=p1.count;
                        a++;
                        System.out.println(a);
                        pair p=new pair(day,a);
                        h.put(merchant,p);
                    }
                    else
                    {
                        System.out.println("max transactions occured");
                        break;
                    }

                }
                else
                {
                    pair p1=new pair(day,1);
                    h.put(merchant,p1);
                }

            }

        }
        Iterator<String> itr=h.keySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(h.get(itr.next()).count);
        }

    }
}
