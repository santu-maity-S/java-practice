import java.text.DecimalFormat;
import java.util.Scanner;

public class Santu4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
      System.out.print("Input weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("Input height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("The Body Mass Index (BMI) is " + df.format(BMI) + " kg/m2");

    }
}