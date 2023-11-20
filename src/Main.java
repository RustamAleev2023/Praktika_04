import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      task1();
//      task2();
//      task3();
      task4();
    }

    //Task1
    public static void task1(){
        int units;
        int tens;
        int hundreds;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  первую цифру");
        hundreds = scanner.nextInt();
        System.out.println("Введите  вторую цифру");
        tens = scanner.nextInt();
        System.out.println("Введите  третью цифру");
        units = scanner.nextInt();

        System.out.println(hundreds * 100 + tens * 10 + units);
    }

    //Task2
    public static void task2(){
        System.out.println("Введите число, состоящее из четырех цифр");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num4 = number % 10;
        number /= 10;
        int num3 = number % 10;
        number /= 10;
        int num2 = number % 10;
        number /= 10;
        int num1 = number % 10;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num1 + " * " + num2 + " * " + num3 + " * " + num4 + " = " + num1 * num2 * num3 * num4 );
    }

    //Task3
    public static void task3(){
        System.out.println("Введите кол-во метров");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("В " + num + "м " + num * 100 + "см");
        System.out.println("В " + num + "м " + num * 10 + "дм");
        System.out.println("В " + num + "м " + num * 1000 + "мм");
        System.out.println("В " + num + "м " + num / 1609.34 + " миль");
    }

    //Task4
    public static void task4(){

    }
}