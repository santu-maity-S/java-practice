import java.util.Scanner;
//assigment 13
public class Array {
    public static void main(String[] args) {
        int j=1;
        int arr_size=5;
        Scanner sc = new Scanner(System.in);
        //take array size
       /*  System.out.println("enter the size of array :");
        int arr_size = 0;
        
            arr_size = sc.nextInt();*/

        

        //user input
        int[] arr = new int[arr_size];
        //System.out.println("enter the element :");
        for(int i = 0; i < arr_size; i++){

                System.out.print("gread " + j +": ");
                arr[i] = sc.nextInt();
                j++;
        }

        // print array
        /*System.out.println("element = ");
        for(int i = 0; i < arr_size; i++){
            System.out.println(arr[i] + " ");
        }*/

    }
}
