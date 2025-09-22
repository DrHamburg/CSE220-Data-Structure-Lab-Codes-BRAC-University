class Task2{
    public static void mostWater( Integer[] height ){
        int temp=0,area=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1; j<height.length;j++){
                int barHeight = Math.min(height[i],height[j]);
                int barWidth = j-i;
                area = barHeight*barWidth;
                if(temp<area){
                    temp = area;
                }
            }
        }
        System.out.printf("%d",temp);

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
        System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
