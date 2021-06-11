import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class samsung2 {
    public static int maxdepth(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            return 1+Math.max(maxdepth(root.left),maxdepth(root.right));
        }
    }
    public static int leftView(TreeNode root, int count, HashSet<Integer> h)
    {
       while(root!=null)
       {
           count=count+root.data;
           System.out.println(count);
           if(root.left==null)
           {
               h.add(root.data);
           }
           root=root.left;

       }
        return count;
    }
    public static int rightView(TreeNode root, int count, HashSet<Integer> h)
    {
        while(root!=null)
        {
            count=count+root.data;
            if(root.right==null)
            {
                h.add(root.data);
            }
            root=root.right;

        }
        return count;
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(5);

        root.left=new TreeNode(6);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(2);
     
        root.left.left.left=new TreeNode(8);
        root.left.left.right=new TreeNode(7);
        root.left.right.right=new TreeNode(11);
        root.right.right=new TreeNode(9);
        root.right.left=new TreeNode(1);
        int count=0;
        HashSet<Integer> h=new HashSet<Integer>();
        System.out.println(leftView(root,0,h));
        count=leftView(root,0,h)+rightView(root,0,h)-root.data;

        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                if(temp.left==null&&temp.right==null&&maxdepth(temp)==1&&!h.contains(temp.data))
                {
                    count=count+temp.data;
                }
            }

        }
        System.out.println(count);




    }
}
