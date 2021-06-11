public class ArrayList<Type> {
    private Type[]arr;
    private int capacity=10;
    private int i=0;
    public ArrayList()
    {
      arr=(Type[])new Object[capacity];

    }
    public void add(Type obj)
    {
        if(i==capacity) {
            expand();
        }
        arr[i]=obj;

        i++;


    }
    public void expand()
    {

           Type arr1[]=(Type[])new Object[2*capacity];

            for(int j=0;j<capacity;j++)
            {
                arr1[j]=arr[j];
                System.out.println(arr1[j]);
            }
            capacity=2*capacity;
            arr=arr1;


    }
    public Type get(int k)
    {
        if(k<capacity&&k>=0)
        {
            return (Type)arr[k];
        }
        else
        {
            throw new IndexOutOfBoundsException("Index out of Bounds for index"+ " "+i);
        }

    }
}
class GFG1
{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<11;i++)
        {
            arr.add(i);
        }
        System.out.println(arr.get(10));

    }
}
