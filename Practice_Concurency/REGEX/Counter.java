package REGEX;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = scanner.nextLine();
        long number = text.chars().filter(Character::isEmoji).count();
        System.out.println(number);
    }
}
