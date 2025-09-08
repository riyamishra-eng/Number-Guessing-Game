import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("|| Welcome to number guessing game.||");
        System.out.println("Choose a positive integer or to close the game enter any negative number or 0.");
            int myNumber = (int) (Math.random() * 100);
do{
            System.out.println("Enter your number = ");
             n = sc.nextInt();

            if (myNumber == n ) {
                System.out.println("Wooho! you guessed the correct number.");
                System.out.println("Game is over.");
                break;
            } else if (myNumber < n) {
                System.out.println("The number you entered is too large.");
            } else if (myNumber > n) {
                System.out.println("The number you entered is too small.");
            }


        }
         while (n>=0);

    }}

