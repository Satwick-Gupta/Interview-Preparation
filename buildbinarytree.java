/*import java.util.*;
public class buildbinarytree {
    public static TreeNode buildBT(String preorder,String Inorder)
    {
       if(preorder.length()!=Inorder.length())
       {
           return null;
       }
       return binarytree(preorder,0,preorder.length()-1,Inorder,0,Inorder.length()-1);
    }
    public static TreeNode binarytree(String preorder,int prestart,int preend,String Inorder,int instart,int inend)
    {
        if(prestart>preend||instart>inend)
        {
            return null;
        }
        char data=preorder.charAt(prestart);
        TreeNode curr=new TreeNode();
        curr.data=data;
        int i;
        for(i=0;i<Inorder.length();i++)
        {
            if(Inorder.charAt(i)==data)
            {
                break;
            }
        }
        curr.left=binarytree(preorder,prestart+1,prestart+i-instart,Inorder,instart,i-1);
        curr.right=binarytree(preorder,prestart+i-instart+1,preend,Inorder,i+1,inend);
        return curr;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String preorder=s.nextLine();
        String Inorder=s.next();
        TreeNode root=buildBT(preorder,Inorder);
        System.out.println(root.data);

    }
}
*/