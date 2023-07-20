import java.util.Scanner;

public class Santu7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        {
            Scanner scanner = new Scanner(System.in);
            int s=5;
            System.out.println("What Is Your Gender(MALE/FEMALE)?" );
            String a = scanner.nextLine().trim().toUpperCase();
            System.out.println("What Is Your Frist Name?" );
            String b = scanner.nextLine().trim().toUpperCase();
            System.out.println("What Is Your Last Name?" );
            String c = scanner.nextLine().trim().toUpperCase();
            System.out.println("What Is Your Age?" );
            int d=sc.nextInt();
            System.out.println( (b) +"IS you Married" +"(Y/N)?" );
            String e = scanner.nextLine().trim().toUpperCase();
            
           {
           if (a.equals("F")) {
               s++;
            }
            else{
                s=s+2;
            }}
            {if (e.equals("N")) {
               s=s+3;
            }
            else{
                s=s+2;
            }}
            if(s==7){
                System.out.println("IF YOU ARE " +a+ " AND YOUR AGE IS " +d+ " BUT YOUR MARIED STUTUS IS " +e+ " THEN I CALL YOU Mr " +(b)+" "+(c));
            }
            else if(s==9){
                System.out.println("IF YOU ARE " +a+ " AND YOUR AGE IS " +d+ " BUT YOUR MARIED STUTUS IS " +e+ " THEN I CALL YOU Ms " +(b)+" "+(c));
            }
            else {
                System.out.println("IF YOU ARE " +a+ " AND YOUR AGE IS " +d+ " BUT YOUR MARIED STUTUS IS " +e+ " THEN I CALL YOU Mrs " +(b)+" "+(c));
            }
        }
    }
}
