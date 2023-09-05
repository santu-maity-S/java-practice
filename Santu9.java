import java.util.Scanner;

public class Santu9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);{
            while(true){
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Which shape AreaYou Want To Calcalut?");
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Enter Number By Folowing Qustion");
            int m=sc.nextInt();
            

            
                //Triangal Calcalut
            if (m==1){
                System.out.println("You Secelct [1) Triangle]");
                System.out.println("Enter Base Of Triangle:");
                double Base=sc.nextDouble();
                System.out.println("Enter Height Of Triangle:");
                double Height=sc.nextDouble();

                        double at=(Base*Height)/2;

                System.out.println("The area Of Triangle is " + at );

            }

                    //Rectangle Calcalute
                    else if (m==2){
                        System.out.println("You Secelct [2) Rectangle]");
                        System.out.println("Enter Length Of Rectangle:");
                        double Lengthe=sc.nextDouble();
                        System.out.println("Enter Width Of Rectangle:");
                        double Width=sc.nextDouble();
        
                                double at=(Lengthe*Width);
        
                        System.out.println("The area Of Rectangle is " + at );
                    }


                    //Square Calcalute
                    else if (m==3){
                        System.out.println("You Secelct [3) Square]");
                        System.out.println("Enter Side length Of Square:");
                        double Lengthe=sc.nextDouble();
        
                                double at=(Lengthe*Lengthe);
        
                        System.out.println("The area Of Square is " + at );
                    }


                    //Circle Calcalute
                    else if (m==4){
                        System.out.println("You Secelct [4) Circle]");
                        System.out.println("Enter Radius Of Circle:");
                        double Radius=sc.nextDouble();
                        double pai=3.142;
        
                                double at=(pai*Radius*Radius);
        
                        System.out.println("The area Of Circle is " + at );
                    }
                    else{
                        System.out.println("You Secelct [5) Quit]");
                        System.out.println("OK ");
                        System.out.println("THANK YOU FOR USE");
                        break;
                    }
                    

         }
        }
    }
}
