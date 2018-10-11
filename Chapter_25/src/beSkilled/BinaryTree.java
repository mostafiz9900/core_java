
package beSkilled;


public class BinaryTree {
    TreeNode_931 root;

     BinaryTree() {
        root=null;
    }

   void printPostorder(TreeNode_931 node){
       if (node==null) {
           return;
       }
       printPostorder(node.left);
       printPostorder(node.right);
       System.out.println(node.key+" ");
   }
  
    
}
