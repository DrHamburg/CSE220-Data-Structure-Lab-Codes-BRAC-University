// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need

    private static int sum(BSTNode r1,BSTNode r2){
        if(r1==null || r2==null){
            return 0;
        }
        return r1.elem+r2.elem+sum(r1.left,r2.right)+sum(r1.right, r2.left);
    }
    public static Integer mirrorSum( BSTNode root ){
        if(root == null){
            return null;
        }
        return sum(root.left,root.right);
    }
    //===============================================================
}
