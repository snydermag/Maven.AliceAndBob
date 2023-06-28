/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        String userInput = "";

        System.out.println("Please enter your name");

        userInput = input.nextLine();

        if (Objects.equals(userInput, "Alice")){
            System.out.println("Hello, " + userInput);
        }
        else if (Objects.equals(userInput, "Bob")){
            System.out.println("Hello, " + userInput);
        }
        else {
            System.out.println("Thanks");
        }

    }
}
