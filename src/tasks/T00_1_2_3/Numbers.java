package tasks.T00_1_2_3;

public class Numbers {
    public static void runOneToFive(){
        for (int i = 1; i < 6; i++){
            System.out.print(i + " ");
        }
    }
    public static void runFiveToOne(){
        for (int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
    }

    public static void runMultiplyThree(){
        int k = 3;
        for(int i = 1; i < 11; i++){
            int result = k*i;
            System.out.println(k + "*" + i + "=" + result);
        }
    }

}
