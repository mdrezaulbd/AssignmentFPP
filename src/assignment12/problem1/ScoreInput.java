package assignment12.problem1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ScoreInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        try {
            System.out.print("Enter score (0-100): ");
            score = scanner.nextInt();
            if (score < 0 || score > 100) {
                throw new UnsupportedOperationException("Score must be between 0 and 100.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer score between 0 and 100.");
            return;
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Score entered: " + score);
    }
}
