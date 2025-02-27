package Trenirovka;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int attempts = 0;
        int bestAttempts = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Введите число (или 'RESULT' для статистики): ");
            String input = scanner.nextLine().trim();

            if ("RESULT".equalsIgnoreCase(input)) {
                System.out.println("Текущие попытки: " + attempts);
                System.out.println("Лучший результат: " + bestAttempts);
            } else {
                try {
                    int guess = Integer.parseInt(input);

                    attempts++;

                    if (guess == target) {
                        System.out.println("Ура! Вы угадали число " + target + " за " + attempts + " попыток.");

                        if (attempts < bestAttempts) {
                            bestAttempts = attempts;
                        }

                        break;
                    } else if (guess < target) {
                        System.out.println("Загаданное число больше, брат!");
                    } else {
                        System.out.println("Загаданное число меньше, брат!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Пожалуйста, введите корректное число.");
                }
            }
        }

        System.out.println("Игра закончена. Спасибо за участие!");
    }
}


