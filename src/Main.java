import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question = "How old is Vinod?";
        String choiceOne = "His age is greater than 50!";
        String choiceTwo = "His age is greater than 40!";
        String choiceThree = "He is in his teens!";

        String correctAnswer = "two";

        // Write a print statement asking the question
        System.out.println("Hi There! Your questions is '" + question + " '");
        // Write a print statement giving the answer choices
        System.out.println("Your Choices are,");
        System.out.println("one:" + choiceOne);
        System.out.println("two:" + choiceTwo);
        System.out.println("three:" + choiceThree);

        // Have the user input an answer
        System.out.println("Enter your answer - one? two or three?");
        // Retrieve the user's input
        Scanner userInput =  new Scanner(System.in);
        String userAnswer = userInput.next();

        // If the user's input matches the correctAnswer...
        if(userAnswer.toLowerCase().equals(correctAnswer)) {
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Perfect! Your answer is correct.");
        }
        // If the user's input does not match the correctAnswer...
        else {
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Oops! That is not correct. The correct answer is Two - His age is greater than 40!");
        }

    }

}
