import java.text.DecimalFormat;
import java.util.Scanner;

public class santu3 {
    public static void main(String[] args) {
        System.out.println("Enter Any Three Number Like this (4.2) I Will Add Them And After Adding I Will Devied This By The INT By Which You Give");
        Scanner sc =new Scanner(System.in);
        {
            DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Enter The Friest Nuber");
            double a =sc.nextDouble();
        System.out.println("Enter The Second Nuber");
            double b =sc.nextDouble();
        System.out.println("Enter The Third Nuber");
        double c =sc.nextDouble();
        double add  = (a+b+c);
        
        System.out.println("Friest Nuber+Second Nuber+Third Nuber=:"+ df.format(add));
        System.out.println("Enter The Devieded Nuber(IT SHOULD BE INTEGER)");
            int d =sc.nextInt();
        double div = (add/d);
        
        System.out.println("Friest Nuber+Second Nuber+Third Nuber/(div)= :"+ df.format(div));
        }
    }
}