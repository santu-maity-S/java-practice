import java.util.Scanner;

public class Santu14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        int arr[] = {45,39,32,12,44,50,26,42,16,20};
        int x=arr.length;
        int n ,i,flag=0;
        System.out.print("Value to find:");
        n=sc.nextInt();
        for(i=0;i<x;i++){
            if(x==n){
                flag++;
                break;
            }

        }
        if(flag==1){
            System.out.println("found");
        }
        else{
            System.out.println("not");
        }
        
}
}
}