package tasks.T00_1_5;

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

    public static void runSum(int num){
        int result = 0;
        for(int i = num; i > 0; i--){
            result += i;
        }
         System.out.println(result);
    }

    public static void runMultiplySeven(){
        int k = 7;
        for(int i = 1; i < 15; i++){
            int result = k*i;
            System.out.print(result + " ");
        }
    }

}
