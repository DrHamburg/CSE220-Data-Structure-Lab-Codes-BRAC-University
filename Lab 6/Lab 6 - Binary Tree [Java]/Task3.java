// Complete the sumTree method
public class Task3 {
        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
//        private static int getdepth(BTNode root){
//            if(root == null)return 0;
//            return 1+Math.max(getdepth(root.left),getdepth(root.right));
//        }
//        private static void sumh(BTNode root, int lvl, int[] arr){
//            if(root==null){
//                return;
//            }
//            sumh(root.left , lvl+1, arr);
//            if(lvl==0){
//                arr[lvl] += (int)root.elem;
//            }else{
//                arr[lvl] += (int)root.elem%lvl;
//            }
//            sumh(root.right, lvl+1, arr);
//        }
//        private static int sumT(int[] arr,int sum,int i){
//            if(i==arr.length){
//                return sum;
//            }
//            sum+=arr[i];
//            i++;
//            return sumT(arr,sum,i);
//        }
//        public static Integer sumTree( BTNode root ){
//            int[] arr = new int[getdepth(root)];
//            sumh(root,0,arr);
//            return sumT(arr,0,0);
//        }
        //============================================================================
//=======================Final Approach=====================================================
        private static int sum(BTNode root,int lvl){
            if(root == null)return 0;
            if(lvl == 0){
                return (int)root.elem+sum(root.left,lvl+1)+sum(root.right,lvl+1);
            }else{
                return (int)root.elem%lvl+sum(root.left,lvl+1)+sum(root.right,lvl+1);
            }
        }
        public static Integer sumTree( BTNode root){
            if(root==null)return 0;
            return sum(root,0);
        }
}
