package tasks.T009;


import java.util.*;

public class Riddle {

    public static void run(){
        int k = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Daite otvet na zagadku\n Что это такое: синий, большой, с усами и полностью набит зайцами?");

        while (k < 3){
            String answer = s.nextLine();
            k++;
            if (answer.equalsIgnoreCase("троллейбус")){
                System.out.println("Правильно!");
                k = 3;
            } else if (answer.equalsIgnoreCase("сдаюсь")) {
                System.out.println("Правильный ответ: троллейбус.");
                k = 3;
            } else {
                System.out.println("Подумай еще.");
            }

        }


    }

}
