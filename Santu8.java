import java.util.Scanner;

public class Santu8 {
    

public static void main(String[] args) {
    String m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,me;
    m1="January";
    m2="February";
    m3="March";
    m4="April";
    m5="May";
    m6="June";
    m7="July";
    m8="August";
    m9="September";
    m10="October";
    m11="November";
    m12="December";
    me="error";

    Scanner sc = new Scanner(System.in);{
        System.out.println("Enter The Number Folow By Month?");
        int m=sc.nextInt();
        if (m==1) {
        System.out.println( "Month 1: " + m1 );
    }
        else if (m==2) {
        System.out.println( "Month 2: " + m2 );
    }
        else if (m==3) {
        System.out.println( "Month 3: " + m3 );
    }
        else if (m==4) {
        System.out.println( "Month 4: " + m4 );
    }
        else if (m==5) {
        System.out.println( "Month 5: " + m5 );
    }
        else if (m==6) {
        System.out.println( "Month 6: " + m6 );
    }
        else if (m==7) {
        System.out.println( "Month 7: " + m7 );
    }
        else if (m==8) {
        System.out.println( "Month 8: " + m8 );
    } 
        else if (m==9) {
        System.out.println( "Month 9: " + m9 );
    } 
        else if (m==10) {
        System.out.println( "Month 10: " + m10 );
    } 
        else if (m==11) {
        System.out.println( "Month 11: " + m11 );
    } 
        else if (m==12) {
        System.out.println( "Month 12: " + m12 );
    } 


    else{
       System.out.println( "Month: " + m + " " + me ); 
    }
    
    

    }

}
}