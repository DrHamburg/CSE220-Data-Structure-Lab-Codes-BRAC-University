// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    private static int sumT(BTNode root,int lvl){
        if(root == null) return 0;
        if(lvl%2==0){
            return -(int)root.elem+sumT(root.left,lvl+1)+sumT(root.right,lvl+1);
        }else{
            return (int)root.elem +sumT(root.left,lvl+1)+sumT(root.right,lvl+1);
        }
    }
    public static Integer levelSum( BTNode root ){

        if(root==null)return 0;
        return sumT(root,0);
    }
    //============================================================================
}