import java.text.DecimalFormat;
import java.util.Scanner;

public class Santu5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Scanner myObj = new Scanner(System.in);
        {

         DecimalFormat df = new DecimalFormat("0");

        System.out.println("Hello.  What is your name?");
        String name = myObj.nextLine();
        System.out.println("HI "+name); 
        System.out.println("How old are you?");
        int b =sc.nextInt();
        int m = (b-5);
        int p = (b+5);
        System.out.print("Did you know that in five years you will be " + df.format(p) + " years old");

        
        System.out.print("And five years ago you were " + df.format(m) + " Imagine that!");
    }
}
}