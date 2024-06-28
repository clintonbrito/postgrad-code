package com.clintonbrito;

import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int number;
    int target = 0;
    Random generator = new Random();
    int easy_mode = generator.nextInt(10);
    int medium_mode = generator.nextInt(100);
    int hard_mode = generator.nextInt(1000);

    Scanner user_input = new Scanner(System.in);

    do {
      System.out.println("Choose a difficulty: ");
      System.out.println("1 - Easy");
      System.out.println("2 - Medium");
      System.out.println("3 - Hard");
      System.out.println("0 - Exit");

      while (!user_input.hasNextInt()) {
        System.out.println("Please enter a valid number.");
        user_input.next();
      }

      number = user_input.nextInt();

      switch (number) {
        case 1:
          System.out.println("You chose Easy mode");
          target = easy_mode;
          break;
        case 2:
          System.out.println("You chose Medium mode");
          target = medium_mode;
          break;
        case 3:
          System.out.println("You chose Hard mode");
          target = hard_mode;
          break;
        case 0:
          System.out.println("You chose to exit the game");
          break;
        default:
          System.out.println("Invalid option. Please insert a number from 0 to 3");
          break;
      }

    } while (number < 0 || number > 3);

    System.out.println("Guess the number I'm thinking, from 0 to " + (number == 1 ? 10 : number == 2 ? 100 : 1000));
    number = user_input.nextInt();

    if (number == target) {
      System.out.println("Congratulations! You guessed the number!");
    } else {
      System.out.println("Sorry, you didn't guess the number. The number was: " + target);
    }
  }
}