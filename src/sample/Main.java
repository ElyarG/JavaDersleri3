package sample;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter Amount");
        int enterAmount = scanner.nextInt();

    String className = enterAmount > 100_000 ? "Business" : "Economy";
        System.out.println(className);

    }
}
