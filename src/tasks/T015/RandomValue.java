package tasks.T015;

import java.util.*;

public class RandomValue {
    private static int[] values;
    private static int[] weights;

    public RandomValue(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
    }

    public static void run(){
        int item = new Random().nextInt(values.length);
        for(int i = 0; i < weights[item]; i++){
            System.out.print(values[item] + " ");
        }
        System.out.println();
    }

}
