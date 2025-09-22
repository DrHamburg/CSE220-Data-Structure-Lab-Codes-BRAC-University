// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need

//    private static Integer sumLeft(BTNode root){
//        if(root == null){
//            return 0;
//        }
//        return (Integer)root.elem + sumLeft(root.left)+sumLeft(root.right);
//    }
//    private static Integer sumRight(BTNode root){
//        if(root == null){
//            return 0;
//        }
//        return (Integer)root.elem + sumRight(root.right)+sumRight(root.left);
//
//    }
//===================================Final Approach===================================
    private static Integer sum(BTNode root){
        if(root == null){
            return 0;
        }
        return (Integer)root.elem + sum(root.left)+sum(root.right);
    }
    public static Integer subtractSummation( BTNode root ){
        if(root==null)return 0;
        return sum(root.left)-sum(root.right);
    }
    //============================================================================
}