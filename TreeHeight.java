public class TreeHeight {
    int feets;
    int inches;
}
class Main{
    static  int TallestTree(TreeHeight trees[],int n)
    {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(trees[i].feets*12)+trees[i].inches;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
      return max;
    }
    public static void main(String[] args) {
        int n=5;

    }
}
