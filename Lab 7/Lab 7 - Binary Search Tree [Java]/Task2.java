// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String

    //======================Approach 1============================
//    private static boolean searching(BSTNode root, int key){
//        if(root == null){
//            return false;
//        }
//        if(root.elem == key){
//            return true;
//        }
//        return searching(root.left,key) || searching(root.right,key);
//    }
//    private static String hFindPath(BSTNode root, Integer key){
//        if(root.elem.equals(key)){
//            return root.elem+" ";
//        }
//        if(root.elem<key){
//            return root.elem+ " "+findPath(root.right,key);
//        }else{
//            return root.elem+" "+findPath(root.left,key);
//        }
//    }
//    public static String findPath( BSTNode root, Integer key ){
//        if (root == null) {
//            return "No Path Found";
//        }
//        boolean flag = searching(root,key);
//        if(flag){
//            return hFindPath(root,key);
//        }else{
//            return "No Path Found";
//        }
//    }

    //======================Approach 2============================

    public static String findPath(BSTNode root, Integer key) {
        if (root == null) {
            return "No Path Found";
        } else {
            String str;
            if (root.elem.equals(key)) {
                return "" + root.elem;
            } else if (key < root.elem) {
                str = findPath(root.left, key);
            } else {
                str = findPath(root.right, key);
            }
            if (!str.equals("No Path Found")) {
                return root.elem + " " + str;
            } else {
                return "No Path Found";
            }
        }
    }


    //======================Approach 3============================

//    public static String findPath( BSTNode root, Integer key ){
//        if(root == null){
//            return null;
//        }else{
//            if (root.elem.equals(key)) {
//                return root.elem + " ";
//            }
//            if(root.elem<key){
//                String b=findPath(root.right,key);
//                String a= root.elem+ " "+b;
//                if(b==null || b == "No Path Found"){
//                    a = "No Path Found";
//                }
//                return a;
//            }else{
//                String b=findPath(root.left,key);
//                String a= root.elem+ " "+b;
//                if(b==null || b == "No Path Found"){
//                    a = "No Path Found";
//                }
//                return a;
//            }
//        }
//    }
    //==========================================================================
}
