package tasks.T010;

public class ArrayTask {

    public static void runMinMaxAvg(){
        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }

        double max = arr[0];
        double min = arr[0];
        double avg = arr[0]/arr.length;

        for (int i = 1; i < arr.length; i++){
            avg += arr[i]/arr.length;
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }

}
