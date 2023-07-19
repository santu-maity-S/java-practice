import java.util.Scanner;

public class Santu6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // first question
        System.out.println("What is the capital of Alaska?");
        System.out.println("1) Melbourne\n2) Anchorage\n3) Juneau");
        String answer1 = scanner.nextLine();
        if (answer1.equals("3")) {
            System.out.println("Right");
            score++;
        }
        else{
            System.out.println("Wrong");
        }

        // second question
        System.out.println("\nQuestion 2: What is the capital city of Japan?");
        System.out.println("1) Beijing\n2) Tokyo\n3) Seoul\n4) Bangkok");
        String answer2 = scanner.nextLine().trim().toUpperCase();
        if (answer2.equals("2")) {
            System.out.println("Right");
            score++;
        }
        else{
            System.out.println("Wrong");
        }

        // third question
        System.out.println("\nQuestion 3: True or False: The Great Wall of China is visible from space.");
        System.out.println("1) True\n2) False");
        String answer3 = scanner.nextLine().trim().toUpperCase();
        if (answer3.equals("2")) {
            System.out.println("Right");
            score++;
        }
        else{
            System.out.println("Wrong");
        }

        // final score
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + " out of 3");
        if(score==1){
            System.out.println("NOT SO GOOD");
        }
        if  (score==0) {
          System.out.println("VERY BAD");  
        }
        else if(score==2){
            System.out.println("GOOD BUT NOT PERFECT");
        }
        else {
            System.out.println("VERY GOOD");
        }

        scanner.close();
    }
}
