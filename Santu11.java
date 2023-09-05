import java.util.Scanner;

public class Santu11 {
    public static void add_keychains() {
        System.out.println("\n ADD KEY CHAINS\n");

    }

    public static void remove_keychains() {
        System.out.println("\n REMOVE KEY CHAINS\n");

    }

    public static void view_order() {
        System.out.println("\n VIEW ORDER\n");

    }

    public static void checkout() {
        System.out.println("\n CHECK OUT\n");

    }

    public static void main(String[] args) {
        Scanner menu=new Scanner(System.in);
        int num;
        System.out.println("Key Chain Shop");
        while (true) {
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            System.out.println("Please enter your choice:");
            num=menu.nextInt();

            if(num==1){
                add_keychains();
            }
            else if(num==2){
                remove_keychains();
            }
            else if(num==3){
                view_order();
            }
            else if(num==4){
                checkout();
                break;
            }
            else{
                System.out.println("ERROR");
            }

        }
        menu.close();
    }
}
