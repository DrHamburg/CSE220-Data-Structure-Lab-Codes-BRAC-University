public class Task3{
    public static Integer[] processingTime(Integer[] tasks, int m){
        Integer[] newTasks = new Integer[m];
        setZero(newTasks);
        machineLoads(tasks,newTasks,0);
        return newTasks;
    }
    private static void setZero(Integer[] newTasks){
        for (int i = 0; i < newTasks.length; i++) {
            newTasks[i] = 0;
        }
    }
    private static void machineLoads(Integer[] tasks, Integer[] newTasks,int m){
        if(m == tasks.length){
            return;
        }else{
            int min = minValue(newTasks);
            newTasks[min]+=tasks[m];
            machineLoads(tasks,newTasks,m+1);
        }
    }
    private static int minValue(Integer[] newTasks){
        int min = 0;
        for (int i = 1; i < newTasks.length; i++) {
            if(newTasks[i]< newTasks[min]){
                min = i;
            }
        }
        return min;
    }
}