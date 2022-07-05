package tasks.T010_11_and_13;

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

    public static void bubbleSort() {
        int[] arr = {11, 7, 9, 3, 2, 4, 6, 5, 17};

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void runDeleteItems(){
        int[] arr = {11, 2, 9, 3, 2, 4, 6, 2, 17};
        int value = 2;
        int k = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == value){
                k++;
            } else{
                arr[i - k] = arr[i];
            }
        }
        int[] newArr = new int[arr.length - k];
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = arr[i];
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }


}
