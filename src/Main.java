import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      task1();
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
}