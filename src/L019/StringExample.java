package L019;

import java.util.*;
import java.util.stream.Stream;

public class StringExample {

    private static String str(){
        return "Добро пожаловать на FoodTech School";
    }

    private static void runContentEquals(){
        System.out.println("runContentEquals");
        String str1 = str();
        String str2 = "Сайт для изучения java";

        StringBuffer str3 = new StringBuffer(str());
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == str3: " + result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3: " + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4: " + result);
    }

    private static void runEqualsIgnoreCase(){
        System.out.println("\nrunEqualsIgnoreCase");

        String str1 = str();
        String str2 = str1;
        String str3 = "Сайт для изучения java";
        String str4 = str();

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
    }

    private static void runCompareTo(){
        System.out.println("\nrunCompareTo");
        String str1 = "Я вызываю метод!";
        String str2 = "Я вызываю метод!";
        String str3 = "Я Вызываю класс!";
        String str4 = str();

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));


    }
    private static void runCompareToIgnoreCase(){
        System.out.println("\nrunCompareToIgnoreCase");
        String str1 = "Я вызываю метод!";
        String str2 = "Я Вызываю Метод!";
        String str3 = "Я Вызываю класс!";
        String str4 = str();

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));
    }

    private static void runToLowerCase() {
        System.out.println("\nrunToLowerCase");

        String str1 = "Я вызываю метод!";
        System.out.println(str1.toLowerCase());
    }
    private static void runToUpperCase() {
        System.out.println("\nrunToLowerCase");

        String str1 = "Я вызываю метод!";
        System.out.println(str1.toUpperCase());
    }

private static void runConcat(){
    System.out.println("\nrunConcat");

    String s = "Я вызываю метод!";
    s = s.concat(" И я вызываю класс!");

    s = s + " String";  //так работает метод concat

    System.out.println(s);
}

private static void runMatches() {
    System.out.println("\nrunMatches");

    String s = str();

    System.out.println(s.matches("(.*)FoodTech(.*)"));
    System.out.println(s.matches("FoodTech"));
    System.out.println(s.matches("Добро(.*)"));
}

private static void runContains(){
    System.out.println("\nrunContains");

    String s = "twinkle twinkle little star";
    System.out.println(s.contains("little"));
    System.out.println(s.contains("5432"));
}

private static void runRegionMatches(){
    System.out.println("\nrunRegionMatches");

    String s1 = str(),
            s2 = "FoodTech School",
            s3 = "Java",
            s4 = "FOODTECH SCOOL";
    System.out.println(s1.regionMatches(20, s2, 0, 8));
    System.out.println(s1.regionMatches(20, s3, 0, 8));
    System.out.println(s1.regionMatches(true, 20, s4, 0, 8));

}

private static void runStartWith(){
    System.out.println("\nrunStartWith");

    String s1 = str(),
            s2 = "Добро",
            s3 = "Java",
            s4 = "FOODTECH SCOOL";

    System.out.println(s1.startsWith(s2));
    System.out.println(s1.startsWith(s3));
    System.out.println(s1.startsWith(s4));
}
private static void runEndsWith(){
    System.out.println("\nrunEndsWith");

    String s1 = str(),
            s2 = "School",
            s3 = "Java",
            s4 = "FOODTECH SCOOL";

    System.out.println(s1.endsWith(s2));
    System.out.println(s1.endsWith(s3));
    System.out.println(s1.endsWith(s4));
}

private static void runLines(){
    System.out.println("\nrunLines");

    String s = "mvmflkvn\n" +
            "skvmkmervmn\n" +
            "mmksmalsmr\n" +
            "kweewikf\n" +
            "sdmvkm\n";

    System.out.println(s);

    Stream<String> lines = s.lines();
    lines.forEach(System.out::println);
    System.out.println(lines);
    }

    private static void runToCharArray(){
        System.out.println("\nrunToCharArray");

        String s1 = str();
        System.out.println(s1.toCharArray()[4]);//массив элементов(символов) строки
    }

    private static void runFormat(){
        System.out.println("\nrunFormat");

        float floatVar = 1.2f;
        int intVar = 12;
        String stringVar = "String";

        String fs;
        fs = String.format("value float = %.4f, value int = %d, value string = %s", floatVar, intVar, stringVar);
        System.out.println(fs);
    }

    private static void runValueOf(){
        System.out.println("\nrunValueOf");

        double d = 12312.2;
        boolean b = true;
        long l = 111l;
        char[] chars = {'d', 'r'};

        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(chars));
    }

    private static void runRepeat(){
        System.out.println("\nrunRepeat");

        String str = "string";
        String repeat = str.repeat(10);
        System.out.println(repeat);
    }

    private static void runIndexOf(){
        System.out.println("\nrunIndexOf");

        String str  = str();
        String sub1 = "Food", sub2 = "Tech";

        System.out.println(str.indexOf(sub1));//указывает позицию первого символа слова в строке(с нуля, включая пробелы)
        System.out.println(str.indexOf(sub2));
        System.out.println(str.indexOf("fds"));//символы не сопадают выводит -1
    }

    private static void runLastIndexOf(){
        System.out.println("\nrunLastIndexOf");

        String str  = str();
        String sub1 = "o";

        System.out.println(str.indexOf(sub1));//позиция, на которой символ используется последний раз
    }

    private static void runSubString(){
        System.out.println("\nrunSubString");

        String str  = str();
        System.out.println(str.substring(11, 15));//позиции начального и конечного символа вывода строки(возварщает string)
    }

    private static void runSubSequence(){
        System.out.println("\nrunSubSequence");

        String str  = str();
        System.out.println(str.subSequence(0, 10));//одинаково с substring(возвращает char)
    }

    private static void runSplit(){
        System.out.println("\nrunSplit");

        String str  = "Добро-пожаловать-на-сайт";
        String[] result = str.split("-");
        for (String s: str.split("-")){  //разбивает строку на массив, элементы которого разделены указанным символом
            System.out.println(s);
        }
        return;
    }

    private static void runJoin(){
        System.out.println("\nrunJoin");

        String join = String.join(", ", "1","2","3");
        System.out.println(join);
    }

    private static void runTrim(){
        System.out.println("\nrunTrim");

        String s = "           Strung";
        System.out.println(s);
        System.out.println(s.trim());//убирает пробелы в начале и конце строки
    }

    private static void runReplace(){
        System.out.println("\nrunReplace");

        String s  = str();
        System.out.println(s);
        System.out.println(s.replace("o", "-"));//заменяет первый символ на второй(все найденные символы)
        System.out.println(s.replaceFirst("o", "-"));//заменяет первый символ на второй(первый найденный символ)
        System.out.println(s.replaceAll("o", "-"));//заменяет первый символ на второй(все найденные символы)
    }

    public static void run(){
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runCompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
        runContains();
        runRegionMatches();
        runStartWith();
        runEndsWith();
        runLines();
        runToCharArray();
        runFormat();
        runValueOf();
        runRepeat();
        runIndexOf();
        runLastIndexOf();
        runSubString();
        runSubSequence();
        runSplit();
        runJoin();
        runTrim();
        runReplace();
    }

}
