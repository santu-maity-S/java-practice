import java.util.Scanner;

public class santu2 {
    public static void main(String[] args) {
        System.out.println("I have Enter a number between 0-9 try to Gues it");
        Scanner sc =new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the Gues number");
            int a =sc.nextInt();
            System.out.println("You Gues");
            if(a==7)
            {
                System.out.println("This is corect");
                System.out.println("Weel Done");
                break;
            }
            else
            {
                System.out.println("This is rong");
                System.out.println("Pless TRY Again");
            }
        }
    }
}
