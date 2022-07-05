package tasks.T00_1_6_and_8_and_12;

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
        System.out.println();
    }

    public static void runDegreesTwo(){
        int k = 2;
        for (int i = 0; i < 10; i++){
            double d = Math.pow(k, i);
            int result = (int) d;
            System.out.print( result + " ");
        }
        System.out.println();
    }

    public static void runFibonacci() {
        int num0 = 1;
        int num1 = 1;
        int num2;

            System.out.print(num0 + " " + num0 + " ");
            for (int i = 3; i <= 11; i++) {
                num2 = num0 + num1;
                System.out.print(num2 + " ");

                num0 = num1;
                num1 = num2;
            }
    }

    public static void runPrimeNumbers(){

        for (int i = 2; i < 101; i++){
            int k = 0;
            for (int j = 2; j < i + 1; j++){
                if(i % j == 0){
                    k++;
                }
            }
            if(k == 1){
                System.out.print( i + " ");
            }
        }
        System.out.println();
    }

}
