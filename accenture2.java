public class accenture2 {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public  static int HCF(int input1,int [] input2)
    {
        int result = 0;
        for (int element: input2){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[]={2,4,8};
        System.out.println(HCF(3,arr));
    }
}
